public class Company {
	private Person[] arr;
	private int count;
	public Company() {
		arr = new Person[10];
	}
	boolean add(Person p) {
		if(!(p instanceof WageEmployee) 
				&& !(p instanceof SalaryEmployee)) {
			return false;
		}

//Массив принято увеличивать в несколько раз, для сокращения процессорного времени.
		if(count == arr.length) {
		Person tmp[]=new Person[arr.length*2];
			for (int i = 0; i < arr.length; i++) {
				tmp[i] = arr[i];
			}
			arr = tmp;
		}
		for(int i = 0; i < count; i++) {
			if(arr[i].equals(p)) {
				return false;
			}
		}
		arr[count] = p;
		count++;
		return true;
	}
	
	boolean remove(int id) {
		Person tmp = new Person("",-123,id);
		int indx = -1;
		for(int i = 0; i < count; i++) {
			if(arr[i].equals(tmp)) {
				indx = i;
				break;
			}
		}
		if(indx >= 0) {
//			for(int i=indx; i<count-1;i++){
//				arr[i]=arr[i+1];
//			}
			// Можно делать вот так тоже)
			for(; indx<count-1;indx++){
				arr[indx]=arr[indx+1];
			}
			arr[count-1] = null;
			count--;
			return true;
		}
		return false;
	}
	
	int size() {
		return count;
	}
	
	void printReport() {
		double total = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] instanceof WageEmployee) {
				WageEmployee tmp = (WageEmployee) arr[i];
				total += tmp.calcSalary();
				System.out.println(arr[i].toString());
			}else if(arr[i] instanceof SalaryEmployee) {
				SalaryEmployee tmp = (SalaryEmployee) arr[i];
				total += tmp.getSalary();
				System.out.println(arr[i].toString());
			}
		if (arr[i]==null){
			System.out.println(arr[i]);
		}
		}

		System.out.println("-----------------");
		System.out.println("Total: " + total);
	}
}

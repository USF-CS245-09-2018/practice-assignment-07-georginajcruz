
public class ArrayList implements List{
	Object[] arr;
	int size;

	public ArrayList() {
		arr = new Object[10];
		size=0;
	}

	public void add(Object obj){
		if(size==arr.length)
			grow();
		arr[size++]=obj;

	}

	public void add(int pos, Object obj){
		if(size==arr.length)
			grow();
		for(int i=size; i>pos; i--){
			arr[i]=arr[i-1];
		}
		arr[pos]=obj;
		size++;
	}

	public Object get(int pos){
		return arr[pos];
	}
	public Object remove(int pos){
		Object temp = arr[pos];
		size--;
		for(int i=pos; i<size; i++){
			arr[i]=arr[i+1];
		}

		return temp;

		
	}
		
	public int size(){
		return size;
	}

	public void grow(){
		Object[] newArr = new Object[arr.length * 2];
		for(int i=0; i<arr.length; i++){
			newArr[i]=arr[i];
		}

		arr=newArr;
	}	

	public boolean empty(){
		return size==0;
	}


}



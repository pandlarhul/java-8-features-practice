class Gen<T>{
	T ob;
	public Gen(T ob){
		this.ob = ob;
	}

	T getob(){
		return ob;
	}

	void showType(){
		System.out.println("Type of T is "+ob.getClass().getName());
	}
}

class mamalia {
	int umur=10;
	
	int getUmur() {
		return umur;	
	}
}

class kucing extends mamalia {
	
	int getUmur() {
		return 20;	
	}

	public static void main(String[] args){
		kucing k = new kucing();
		System.out.println(k.getUmur());	
	}
	

}
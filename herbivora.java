class binatang {
	int umur=22;
	
	int getUmur() {
		return umur;
	}
}

class  herbivora extends binatang{
	public static void main(String[] args) {
		herbivora h = new herbivora();
		System.out.println(h.getUmur());
	}

}
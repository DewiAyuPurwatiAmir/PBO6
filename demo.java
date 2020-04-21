class hewan {
	
	void suara() {
		System.out.println("Suara Hewan");
	}	

}

class tokke extends hewan {
	
	void suara() {
		System.out.println("tokke");
	}
}

class ayam extends hewan {
	
	void suara() {
		System.out.println("kokokokokok");
	}
}


class demo{
	
	public static void main(String[] args) {
		hewan h = new hewan();
		h.suara();
		
		hewan t = new tokke();
		t.suara();
		
		hewan a = new ayam();
		a.suara();
	}
}
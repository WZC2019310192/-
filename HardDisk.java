package shiyan;

public class HardDisk {
	String brand;
	String s;
		private int amount;
		HardDisk(){}
		HardDisk(String brand,String s,int amount ){
			this.brand=brand;
			this.s=s;
			this.amount=amount;
		}
		void setAmount(int m) {
			amount = m;
		}
		String brand(String b) {
			brand=b;
			return brand;
		}
		int getAmound() {
			return amount;
		}
	}



package shiyan;

public class PC {
	CPU cpu;
	HardDisk HD;
	void setCPU(CPU c) {
		cpu=c;
	}
	void setHardDisk(HardDisk h) {
		HD = h ;
		}
	void show() {
		System.out.println("CPU���ٶ�Ϊ"+cpu.getSpeed());
		System.out.println("Ӳ�̵�����Ϊ"+HD.getAmound());
		System.out.println("Ӳ�̵�Ʒ��"+HD.brand("sansung"));
		System.out.println("cpu�۸�"+cpu.getPrice());
	}

}

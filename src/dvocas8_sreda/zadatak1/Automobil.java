package dvocas8_sreda.zadatak1;

public class Automobil extends MotornoVozilo {
	
	public double izracunajRegistraciju() {
		return 6000 + getKubikaza()*8 + getSnaga()*2;
	}

}

package dvocas8_sreda.zadatak1;

public class Motocikl extends MotornoVozilo {

	@Override
	public double izracunajRegistraciju() {
		return 4000 + getKubikaza()*4 + getSnaga()*2;
	}

}

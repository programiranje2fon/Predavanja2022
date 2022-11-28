package dvocas8_ponedeljak.zadatak1;

public class Automobil extends MotornoVozilo {

	@Override
	public double izracunajRegistraciju() {
		double iznos = 6000 + getKubikaza() * 8 + getSnaga() * 2;
		return iznos;
	}



}

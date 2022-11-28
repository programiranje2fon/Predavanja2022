package dvocas8_ponedeljak.zadatak1;

public class Motocikl extends MotornoVozilo {

	@Override
	public double izracunajRegistraciju() {
		double iznos = 4000 + getKubikaza() *4 + getSnaga() * 2;
		return iznos;
	}

}

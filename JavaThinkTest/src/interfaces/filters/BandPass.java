package interfaces.filters;

public class BandPass extends Filter {
	double lowCutoff, highCutoff;

	public BandPass(double lowCut, double hightCut) {
		lowCutoff = lowCut;
		highCutoff = hightCut;
	}

	public Waveform process(Waveform input) {
		return input;
	}
}

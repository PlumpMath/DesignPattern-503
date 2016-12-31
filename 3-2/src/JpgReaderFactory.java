
public class JpgReaderFactory implements ImageReaderFactory{

	public ImageReader createImageReader(){
		return new JpgReader();
	}

}

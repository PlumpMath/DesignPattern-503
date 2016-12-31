
public class GifReaderFactory implements ImageReaderFactory{

	public ImageReader createImageReader(){
		return new GifReader();
	}
}

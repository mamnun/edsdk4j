package edsdk.bindingsv34;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : EDSDK/Header/EDSDKTypes.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class EdsUsersetData extends Structure {
	/** C type : EdsUInt32 */
	public NativeLong valid;
	/** C type : EdsUInt32 */
	public NativeLong dataSize;
	/** C type : EdsChar[32] */
	public byte[] szCaption = new byte[32];
	/** C type : EdsUInt8[1] */
	public byte[] data = new byte[1];
	public EdsUsersetData() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("valid", "dataSize", "szCaption", "data");
	}
	/**
	 * @param valid C type : EdsUInt32<br>
	 * @param dataSize C type : EdsUInt32<br>
	 * @param szCaption C type : EdsChar[32]<br>
	 * @param data C type : EdsUInt8[1]
	 */
	public EdsUsersetData(NativeLong valid, NativeLong dataSize, byte szCaption[], byte data[]) {
		super();
		this.valid = valid;
		this.dataSize = dataSize;
		if ((szCaption.length != this.szCaption.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szCaption = szCaption;
		if ((data.length != this.data.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.data = data;
	}
	public EdsUsersetData(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends EdsUsersetData implements Structure.ByReference {
		
	};
	public static class ByValue extends EdsUsersetData implements Structure.ByValue {
		
	};
}

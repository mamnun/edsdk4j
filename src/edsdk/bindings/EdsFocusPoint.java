package edsdk.bindings;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
/**
 * <i>native declaration : EDSDK\Header\EDSDKTypes.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class EdsFocusPoint extends Structure {
	/// C type : EdsUInt32
	public NativeLong valid;
	/// C type : EdsUInt32
	public NativeLong selected;
	/// C type : EdsUInt32
	public NativeLong justFocus;
	/// C type : EdsRect
	public EdsRect rect;
	/// C type : EdsUInt32
	public NativeLong reserved;
	public EdsFocusPoint() {
		super();
		initFieldOrder();
	}
	protected void initFieldOrder() {
		setFieldOrder(new String[]{"valid", "selected", "justFocus", "rect", "reserved"});
	}
	/**
	 * @param valid C type : EdsUInt32<br>
	 * @param selected C type : EdsUInt32<br>
	 * @param justFocus C type : EdsUInt32<br>
	 * @param rect C type : EdsRect<br>
	 * @param reserved C type : EdsUInt32
	 */
	public EdsFocusPoint(NativeLong valid, NativeLong selected, NativeLong justFocus, EdsRect rect, NativeLong reserved) {
		super();
		this.valid = valid;
		this.selected = selected;
		this.justFocus = justFocus;
		this.rect = rect;
		this.reserved = reserved;
		initFieldOrder();
	}
    public EdsFocusPoint(Pointer pointer) {
        super(pointer);
        read();
    }
	public static class ByReference extends EdsFocusPoint implements Structure.ByReference {
		
	};
	public static class ByValue extends EdsFocusPoint implements Structure.ByValue {
		
	};
}

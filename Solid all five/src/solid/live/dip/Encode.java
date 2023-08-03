package solid.live.dip;

import net.iharder.Base64;

public class Encode implements encodeData{
    @Override
    public String encodedData(String unEncryptedText) {
        return Base64.encodeBytes(unEncryptedText.getBytes());
    }
}

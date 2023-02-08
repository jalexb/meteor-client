import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("pd")
@Implements("ByteArrayNode")
public class ByteArrayNode extends Node {
    @ObfuscatedName("f")
    public byte[] byteArray;

   public ByteArrayNode(byte[] var1) {
      this.byteArray = var1;
   }
}

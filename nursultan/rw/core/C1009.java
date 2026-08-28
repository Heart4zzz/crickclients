package rw.core;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.value.ArrayValue;
import org.msgpack.value.Value;
import rw.gui.PgUp;

public class C1009 {
   private static byte[] f1000;
   private static boolean[] f2000;
   private static String[] f3000;

   private static void m4000() {
      boolean[] var128 = new boolean[7];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[2] = (boolean)((0 | -0) >>> 31);
      f2000[3] = (boolean)((1 | -1) >>> 31);
      f2000[4] = (boolean)((0 | -0) >>> 31);
      f2000[5] = (boolean)((0 | -0) >>> 31);
      f2000[6] = (boolean)((1 | -1) >>> 31);
   }

   private C1009() {
      throw new UnsupportedOperationException(f3000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      byte[] var128 = new byte[2];
      f1000[(0 | -0) >>> 31] = 2;
      f1000[(1 | -1) >>> 31] = 2;
   }

   public static void m10000(MessageBufferPacker var0, Base1014<?> var1) throws IOException {
      switch (var1) {
         case C0991 var4:
            var0.packBoolean((Boolean)var4.W());
            break;
         case C0988 var5:
            var0.packFloat((Float)var5.W());
            break;
         case OlqIlmnt var6:
            var0.packString((String)var6.W());
            break;
         case C1006 var7:
            var0.packArrayHeader(f1000[0]);
            var0.packInt(((PgUp)var7.W()).m8000());
            var0.packInt(var7.m2000());
            break;
         case C0998 var8:
            var0.packInt((Integer)var8.W());
            break;
         case C1004 var9:
            C0979 var15 = (C0979)var9.W();
            var0.packArrayHeader(f1000[1]);
            var0.packFloat(var15.m32000());
            var0.packFloat(var15.m2000());
            break;
         case C1000 var10:
            var0.packString(((C1013)var10.W()).m22000().m10000());
            break;
         case C1003 var11:
            List var12 = (List)var11.W();
            var0.packArrayHeader(var12.size());

            for (C1013 var14 : var12) {
               var0.packString(var14.m22000().m10000());
            }
            break;
         default:
            var0.packNil();
      }
   }

   private static void m16000() {
      f3000 = new String[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = "This is a utility class and cannot be instantiated";
   }

   public static void m24000(Base1014<?> var0, Value var1) {
      switch (var0) {
         case C0991 var4:
            var4.N(var1.asBooleanValue().getBoolean());
            break;
         case C0988 var5:
            var5.m32000(var1.asFloatValue().toFloat());
            break;
         case OlqIlmnt var6:
            var6.m10000(var1.asStringValue().asString());
            break;
         case C1006 var7:
            if (var1.isArrayValue()) {
               ArrayValue var15 = var1.asArrayValue();
               var7.m6000(PgUp.m76000(var15.get(f2000[2]).asIntegerValue().asInt()), var15.get(f2000[3]).asIntegerValue().asInt());
            } else {
               var7.m6000(PgUp.m76000(var1.asIntegerValue().asInt()), f2000[4]);
            }
            break;
         case C0998 var8:
            var8.N(var1.asIntegerValue().asInt());
            break;
         case C1004 var9:
            ArrayValue var16 = var1.asArrayValue();
            float var18 = var16.get(f2000[5]).asFloatValue().toFloat();
            float var19 = var16.get(f2000[6]).asFloatValue().toFloat();
            var9.m26000(new C0979(var18, var19));
            break;
         case C1000 var10:
            String var17 = var1.asStringValue().asString();
            var10.m2000().stream().filter(var1x -> var1x.m22000().m10000().equals(var17)).findFirst().ifPresent(var1x -> var10.m18000(var1x));
            break;
         case C1003 var11:
            HashSet var12 = new HashSet();

            for (Value var14 : var1.asArrayValue()) {
               var12.add(var14.asStringValue().asString());
            }

            var11.m2000().forEach(var2 -> var11.m16000(var2, var12.contains(var2.m22000().m10000())));
            return;
         default:
      }
   }
}

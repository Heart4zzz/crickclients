package rw.gui;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.logging.log4j.Logger;
import org.joml.Vector2f;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;
import rw.api.Iface0196;
import rw.core.Base0973;
import rw.core.C0094;
import rw.core.LeAm;
import rw.defs.IlinkjOs;

public class HudPositions extends Base0973 {
   private static String[] f1000;
   private static short[] f2000;
   public Object[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   public static Object[] f8000;
   private static short[] f9000;
   private static short[] f10000;

   public Vector2f m2000() {
      this.m6000();
      return (Vector2f)this.f3000[3];
   }

   public Vector2f m4000(String var1) {
      this.m6000();
      return (Vector2f)((Map)this.f3000[0]).get(var1);
   }

   public Map<String, IlinkjOs> m6000() {
      this.m6000();
      return (Map<String, IlinkjOs>)this.f3000[f7000[4]];
   }

   private void m8000() {
      this.m6000();
      ((Map)this.f3000[0]).clear();
      ((Map)this.f3000[1]).clear();

      for (DragOffset var2 : (List)LeAm.f5000[7]) {
         Vector2f var3 = var2.m28000();
         if (var3 != null) {
            ((Map)this.f3000[0]).put(var2.m52000(), var3);
            ((Map)this.f3000[1]).put(var2.m52000(), var2.m4000());
         }
      }

      Vector2f var8 = rw.setting.C0008.m58000();
      this.f3000[f7000[0]] = var8;
      ((Map)this.f3000[f7000[1]]).clear();

      for (Entry var10 : C0094.m26000().entrySet()) {
         ((Map)this.f3000[f7000[2]]).put((String)var10.getKey(), (Boolean)((Iface0196)var10.getValue()).m2000());
      }
   }

   public HudPositions(String var1, int var2) {
      super(var1, var2, null);
      this.m6000();
      HashMap var7 = new HashMap();
      this.f3000[0] = var7;
      HashMap var8 = new HashMap();
      this.f3000[1] = var8;
      HashMap var9 = new HashMap();
      this.f3000[2] = var9;
   }

   static {
      ntfClinit();
   }

   public Map<String, Vector2f> m10000() {
      this.m6000();
      return (Map<String, Vector2f>)this.f3000[f7000[3]];
   }

   public Map<String, Boolean> m12000() {
      this.m6000();
      return (Map<String, Boolean>)this.f3000[f7000[5]];
   }

   private static void m16000() {
      f10000 = new short[]{0, 1, 2};
      f2000 = new short[]{0, 1, 3};
      f6000 = new short[]{2, 0, 3};
      f5000 = new short[]{2, 0, 0, 1, 3, 3, 3, 2};
      f9000 = new short[]{2, 0, 1, 1, 0, 0, 3, 3};
      f4000 = new short[]{2, 2, 0, 0, 1, 7, 0, 1};
      f7000 = new short[]{3, 2, 2, 0, 1, 2, 3};
   }

   private static void m20000() {
      f8000 = new Object[]{null};
   }

   private void m6000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[4];
         Object[] var1 = this.f3000;
      }
   }

   public Vector2f m24000() {
      this.m6000();
      return (Vector2f)this.f3000[f7000[6]];
   }

   public Boolean m26000(String var1) {
      this.m6000();
      return (Boolean)((Map)this.f3000[2]).get(var1);
   }

   public IlinkjOs m30000(String var1) {
      this.m6000();
      return (IlinkjOs)((Map)this.f3000[1]).get(var1);
   }

   public void m12000(MessageBufferPacker var1) throws IOException {
      this.m6000();
      this.m8000();
      var1.packArrayHeader(3);
      var1.packMapHeader(((Map)this.f3000[0]).size());

      for (Entry var3 : ((Map)this.f3000[0]).entrySet()) {
         var1.packString((String)var3.getKey());
         IlinkjOs var4 = (IlinkjOs)((Map)this.f3000[1]).get(var3.getKey());
         var1.packArrayHeader(3);
         var1.packFloat(((Vector2f)var3.getValue()).x);
         var1.packFloat(((Vector2f)var3.getValue()).y);
         var1.packInt(var4 != null ? var4.ordinal() : 0);
      }

      if ((Vector2f)this.f3000[3] == null) {
         var1.packNil();
      } else {
         var1.packArrayHeader(2);
         var1.packFloat(((Vector2f)this.f3000[3]).x);
         var1.packFloat(((Vector2f)this.f3000[3]).y);
      }

      var1.packMapHeader(((Map)this.f3000[2]).size());

      for (Entry var6 : ((Map)this.f3000[2]).entrySet()) {
         var1.packString((String)var6.getKey());
         var1.packBoolean((Boolean)var6.getValue());
      }
   }

   public void m14000(int var1, MessageUnpacker var2) throws IOException {
      this.m6000();
      var2.unpackArrayHeader();
      ((Map)this.f3000[0]).clear();
      ((Map)this.f3000[1]).clear();
      int var3 = var2.unpackMapHeader();

      for (int var4 = 0; var4 < var3; var4++) {
         try {
            String var5 = var2.unpackString();
            int var6 = var2.unpackArrayHeader();
            float var7 = var2.unpackFloat();
            float var8 = var2.unpackFloat();
            if (var6 > 2) {
               int var9 = var2.unpackInt();
               IlinkjOs[] var10 = IlinkjOs.m10000();
               if (var9 >= 0 && var9 < var10.length) {
                  ((Map)this.f3000[1]).put(var5, var10[var9]);
               }

               for (int var11 = 3; var11 < var6; var11++) {
                  var2.skipValue();
               }
            }

            ((Map)this.f3000[0]).put(var5, new Vector2f(var7, var8));
         } catch (Exception var19) {
            ((Logger)f8000[0]).warn(f1000[0], var4, this.u(), var19.getMessage());
         }
      }

      if (var2.tryUnpackNil()) {
         Object var16 = null;
         this.f3000[3] = var16;
      } else {
         var2.unpackArrayHeader();
         float var20 = var2.unpackFloat();
         float var22 = var2.unpackFloat();
         Vector2f var17 = new Vector2f(var20, var22);
         this.f3000[3] = var17;
      }

      ((Map)this.f3000[2]).clear();
      int var21 = var2.unpackMapHeader();

      for (int var23 = 0; var23 < var21; var23++) {
         try {
            String var24 = var2.unpackString();
            boolean var25 = var2.unpackBoolean();
            ((Map)this.f3000[2]).put(var24, var25);
         } catch (Exception var18) {
            ((Logger)f8000[0]).warn(f1000[1], var23, this.u(), var18.getMessage());
         }
      }
   }

   private static void m32000() {
      f1000 = new String[]{"Skipped corrupt hud position #{} in {}: {}", "Skipped corrupt subcategory flag #{} in {}: {}"};
   }

   @Override
   public boolean d_() {
      this.m6000();
      return (boolean)(((Map)this.f3000[0]).isEmpty() && (Vector2f)this.f3000[3] == null && ((Map)this.f3000[2]).isEmpty() ? 1 : 0);
   }
}

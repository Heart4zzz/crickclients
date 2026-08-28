package rw.gui;

import KDFzREm.NNBK;
import KDFzREm.NNuU;
import KDFzREm.ow;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.List;
import net.minecraft.client.gui.font.TextRenderable$Styled;
import org.apache.logging.log4j.Logger;
import org.joml.Matrix3x2f;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector4f;
import org.joml.Vector4fc;
import org.lwjgl.opengl.GL11;
import rw.api.Iface0003;
import rw.api.Iface0006;
import rw.api.Iface0213;
import rw.api.Iface0214;
import rw.api.Iface0215;
import rw.api.Iface0672;
import rw.core.C0012;
import rw.core.C0248;
import rw.core.C0340;
import rw.core.C0346;
import rw.core.C0805;
import rw.core.C0806;
import rw.core.C0830;
import rw.core.C1057;
import rw.core.C1072;
import rw.core.C1117;
import rw.core.C1118;
import rw.core.C1120;
import rw.core.C1128;
import rw.core.C1134;
import rw.core.C1225;
import rw.core.C1239;
import rw.core.C1250;
import rw.core.IlmOisOkp;
import rw.core.KrHa;
import rw.data.Rec0068;
import rw.data.Rec0109;
import rw.data.Rec0110;
import rw.data.Rec0111;
import rw.data.Rec0113;
import rw.data.Rec0114;
import rw.data.Rec0115;
import rw.data.Rec0116;
import rw.data.Rec0117;
import rw.data.Rec0119;
import rw.data.Rec0120;
import rw.data.Rec0121;
import rw.data.Rec0122;
import rw.data.Rec0232;
import rw.data.Rec0233;
import rw.data.Rec0236;
import rw.data.Rec0246;
import rw.data.Rec0249;
import rw.defs.Enum0027;
import rw.defs.OlmmOsl;
import rw.setting.OlpOtr;
import rw.setting.Rec0036;

public class PdYp implements Iface0213 {
   private static float[] f1000;
   public static Object[] f2000;
   private static boolean[] f3000;
   private static byte[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   public Object[] f7000;
   private static byte[] f8000;
   private static boolean[] f9000;
   private static float[] f10000;
   private static short[] f11000;
   private static boolean[] f12000;
   private static short[] f13000;
   private static boolean[] f14000;
   private static byte[] f15000;
   private static float[] f16000;
   public Object[] f17000;
   private static short[] f18000;
   private static float[] f19000;
   private static short[] f20000;
   private static short[] f21000;
   public Object[] f22000;
   private static boolean[] f23000;
   private static float[] f24000;
   private static short[] f25000;
   private static double[] f26000;
   private static short[] f27000;
   private static short[] f28000;
   private static byte[] f29000;
   private static short[] f30000;
   private static boolean[] f31000;
   private static boolean[] f32000;
   public Object[] f33000;
   private static short[] f34000;
   private static short[] f35000;
   private static short[] f36000;
   private static boolean[] f37000;
   private static short[] f38000;
   private static short[] f39000;
   private static boolean[] f40000;
   public static Object[] f41000;
   private static float[] f42000;
   private static short[] f43000;
   private static short[] f44000;
   private static byte[] f45000;
   public Object[] f46000;
   private static byte[] f47000;
   private static short[] f48000;
   private static float[] f49000;
   private static String[] f50000;
   private static short[] f51000;
   public Object[] f52000;
   public static Object[] f53000;
   private static float[] f54000;
   private static byte[] f55000;
   private static float[] f56000;
   private static short[] f57000;
   private static byte[] f58000;
   private static float[] f59000;
   private static byte[] f60000;
   private static String[] f61000;
   private static byte[] f62000;
   private static float[] f63000;
   private static short[] f64000;
   private static float[] f65000;
   private static short[] f66000;
   private static short[] f67000;
   private static byte[] f68000;
   private static float[] f69000;
   private static short[] f70000;
   private static short[] f71000;
   private static boolean[] f72000;
   private static short[] f73000;
   private static short[] f74000;
   private static short[] f75000;
   private static short[] f76000;
   public Object[] f77000;
   private static byte[] f78000;
   private static short[] f79000;
   private static byte[] f80000;
   private static String[] f81000;
   private static short[] f82000;
   private static boolean[] f83000;
   private static short[] f84000;
   private static short[] f85000;
   public Object[] f86000;
   private static short[] f87000;
   private static short[] f88000;
   public Object[] f89000;
   private static short[] f90000;
   private static boolean[] f91000;
   private static boolean[] f92000;
   private static boolean[] f93000;
   private static boolean[] f94000;
   private static short[] f95000;
   private static byte[] f96000;
   private static short[] f97000;
   private static float[] f98000;
   private static short[] f99000;
   private static short[] f100000;
   private static boolean[] f101000;
   private static boolean[] f102000;
   private static short[] f103000;
   private static short[] f104000;
   private static short[] f105000;
   private static float[] f106000;
   private static short[] f107000;
   private static short[] f108000;
   public Object[] f109000;
   private static short[] f110000;
   private static short[] f111000;
   private static short[] f112000;
   public Object[] f113000;
   private static boolean[] f114000;
   private static boolean[] f115000;
   private static byte[] f116000;
   private static short[] f117000;
   private static short[] f118000;
   private static short[] f119000;
   private static short[] f120000;
   private static boolean[] f121000;
   private static short[] f122000;
   private static byte[] f123000;
   private static float[] f124000;
   private static short[] f125000;
   private static short[] f126000;
   private static short[] f127000;
   private static boolean[] f128000;
   private static byte[] f129000;
   private static byte[] f130000;
   private static short[] f131000;
   private static short[] f132000;
   private static byte[] f133000;
   private static String[] f134000;
   private static short[] f135000;
   private static short[] f136000;
   private static short[] f137000;
   public static Object[] f138000;
   private static short[] f139000;
   private static short[] f140000;
   private static byte[] f141000;
   private static boolean[] f142000;
   private static float[] f143000;
   private static short[] f144000;
   private static short[] f145000;
   private static short[] f146000;
   public Object[] f147000;
   private static int[] f148000;
   private static short[] f149000;
   private static short[] f150000;
   private static short[] f151000;
   private static short[] f152000;
   private static boolean[] f153000;
   private static float[] f154000;
   private static short[] f155000;
   private static short[] f156000;
   private static String[] f157000;
   private static byte[] f158000;
   private static short[] f159000;
   private static float[] f160000;
   private static boolean[] f161000;
   public Object[] f162000;
   private static float[] f163000;
   private static boolean[] f164000;
   private static short[] f165000;
   public Object[] f166000;
   private static boolean[] f167000;
   private static float[] f168000;
   private static short[] f169000;
   private static boolean[] f170000;
   private static short[] f171000;
   private static short[] f172000;
   private static boolean[] f173000;
   private static byte[] f174000;
   private static short[] f175000;
   private static float[] f176000;
   private static float[] f177000;
   private static byte[] f178000;
   private static boolean[] f179000;
   private static short[] f180000;
   private static boolean[] f181000;
   private static byte[] f182000;
   private static boolean[] f183000;
   private static short[] f184000;
   private static short[] f185000;
   private static short[] f186000;
   private static boolean[] f187000;
   private static short[] f188000;
   private static float[] f189000;
   private static boolean[] f190000;
   private static short[] f191000;
   private static String[] f192000;
   private static boolean[] f193000;
   private static String[] f194000;
   private static short[] f195000;
   private static short[] f196000;
   private static short[] f197000;
   private static short[] f198000;
   private static short[] f199000;
   private static short[] f200000;
   private static short[] f201000;
   private static short[] f202000;
   private static short[] f203000;
   private static byte[] f204000;
   private static short[] f205000;
   private static String[] f206000;
   private static short[] f207000;
   public static Object[] f208000;
   private static byte[] f209000;
   private static short[] f210000;
   private static String[] f211000;
   private static byte[] f212000;
   private static short[] f213000;
   private static short[] f214000;
   private static boolean[] f215000;

   private void m2000() {
      if ((Integer)this.f109000[f136000[2]] > 0) {
         while (this.f109000[f90000[0]] > 0) {
            Integer var5 = (Integer)this.f109000[f90000[1]] - f12000[3];
            this.f109000[f90000[2]] = var5;
            IlmOisOkp var10000 = ((IlmOisOkp[])this.f109000[f90000[3]])[this.f109000[f57000[0]]];
            Object var6 = null;
            var10000.f1000[f57000[1]] = var6;
         }

         Integer var7 = (Integer)this.f162000[f57000[2]] + f12000[4];
         this.f162000[f57000[3]] = var7;
      }

      GL11.glDisable(f57000[4]);
   }

   private float m10000(float var1) {
      float var2 = this.f46000[f126000[0]] > f19000[0] ? (Float)this.f46000[f126000[1]] : f19000[1];
      return Math.round(var1 * var2) / var2;
   }

   public String m12000() {
      return "count:" + (Integer)this.f77000[f195000[0]] + " " + (StringBuilder)this.f77000[f195000[1]];
   }

   public void m18000() {
      if (!((Deque)this.f113000[f207000[1]]).isEmpty()) {
         this.m38000(f61000[0]);
         ((Deque)this.f113000[f207000[2]]).pop();
         this.m40000();
      }
   }

   private static void m26000() {
      f194000 = new String[]{"ui", "lbegin", "lend", "spush"};
      f61000 = new String[]{"spop", "cflush"};
      f134000 = new String[]{"canvas", "bflush", "blur", "blur"};
      f206000 = new String[]{"comp", "tex", ", "};
      f157000 = new String[]{"blur_in", "u_blur_size"};
      f81000 = new String[]{"u_blur_uv_scale", "UI shader clip stack overflow: {} clips, max {}", "clip", "clip", "u_clip_flags", "u_clip_rect"};
      f211000 = new String[]{"u_clip_round", "u_clip_flags"};
      f50000 = new String[]{"u_clip_count", "u_clip_flags", "u_projection", "u_projection", "u_view"};
      f192000 = new String[]{"texture_in", "u_projection", "u_view", "texture_in", "u_size", "u_round", "u_pos"};
   }

   private void m28000() {
      ((Deque)this.f113000[f136000[0]]).clear();
      GL11.glDisable(f136000[1]);
   }

   public PdYp(C1117 var1) {
      this.m256000();
      NNuU var6 = NNuU.Nq();
      this.f113000[f112000[0]] = var6;
      ArrayDeque var7 = new ArrayDeque();
      this.f113000[f112000[1]] = var7;
      Matrix3x2f var8 = new Matrix3x2f().identity();
      this.f113000[f112000[2]] = var8;
      Matrix4f var9 = new Matrix4f();
      this.f113000[f112000[3]] = var9;
      Vector2f var10 = new Vector2f();
      this.f17000[f112000[4]] = var10;
      Vector2f var11 = new Vector2f();
      this.f17000[f112000[5]] = var11;
      Vector2f var12 = new Vector2f();
      this.f17000[f39000[0]] = var12;
      Vector2f var13 = new Vector2f();
      this.f17000[f39000[1]] = var13;
      Vector2f var14 = new Vector2f();
      this.f17000[f39000[2]] = var14;
      Vector4f var15 = new Vector4f();
      this.f17000[f39000[3]] = var15;
      Vector4f var16 = new Vector4f();
      this.f17000[f39000[4]] = var16;
      Vector4f var17 = new Vector4f();
      this.f17000[f44000[0]] = var17;
      Vector4f var18 = new Vector4f();
      this.f147000[f44000[1]] = var18;
      Vector4f var19 = new Vector4f();
      this.f147000[f44000[2]] = var19;
      Vector4f var20 = new Vector4f();
      this.f147000[f44000[3]] = var20;
      Vector4f var21 = new Vector4f();
      this.f147000[f44000[4]] = var21;
      Vector4f var22 = new Vector4f();
      this.f147000[f144000[0]] = var22;
      Vector4f var23 = new Vector4f();
      this.f147000[f144000[1]] = var23;
      C1128 var24 = new C1128(f178000[0]);
      this.f147000[f144000[2]] = var24;
      C1128 var25 = new C1128(f178000[1]);
      this.f147000[f117000[0]] = var25;
      C1128 var26 = new C1128(f130000[0]);
      this.f86000[f117000[1]] = var26;
      C1128 var27 = new C1128(f130000[1]);
      this.f86000[f117000[2]] = var27;
      int[] var28 = new int[f130000[2]];
      this.f86000[f117000[3]] = var28;
      rw.core.C0014 var29 = new rw.core.C0014();
      this.f22000[f70000[0]] = var29;
      C1134 var30 = new C1134(this, f70000[1], f59000[0], f167000[0]);
      this.f22000[f70000[2]] = var30;
      Integer var31 = Integer.valueOf(f130000[3]);
      this.f162000[f70000[3]] = var31;
      IlmOisOkp[] var32 = new IlmOisOkp[f130000[4]];
      this.f109000[f70000[4]] = var32;
      Matrix3x2f[] var33 = new Matrix3x2f[f130000[5]];
      this.f109000[f70000[5]] = var33;
      float[] var34 = new float[f130000[6]];
      this.f166000[f186000[0]] = var34;
      Float var35 = f59000[1];
      this.f52000[f186000[1]] = var35;
      Float var36 = f59000[2];
      this.f33000[f186000[2]] = var36;
      Float var37 = f59000[3];
      this.f33000[f186000[3]] = var37;
      C1120[] var38 = new C1120[f45000[0]];
      this.f77000[f186000[4]] = var38;
      ArrayList var39 = new ArrayList();
      this.f77000[f186000[5]] = var39;
      StringBuilder var40 = new StringBuilder();
      this.f77000[f186000[6]] = var40;
      C1072 var41 = new C1072(var1);
      this.f22000[f73000[0]] = var41;
   }

   static {
      ntfClinit();
   }

   private int m32000() {
      return ((Integer)this.f89000[f156000[3]] & f80000[2]) << f80000[3];
   }

   private void m38000(String var1) {
      this.m242000(var1);
   }

   private void m40000() {
      if (((Deque)this.f113000[f126000[5]]).isEmpty()) {
         GL11.glDisable(f25000[0]);
      } else {
         ow var1 = ((NNuU)this.f113000[f25000[1]]).Nt();
         int var2 = Math.max(f114000[3], var1.U());
         int var3 = Math.max(f114000[4], var1.E());
         Rec0236 var4 = (Rec0236)((Deque)this.f113000[f199000[0]]).peek();
         int var5 = Math.clamp((long)((int)Math.floor(var4.m2000())), f128000[0], var2);
         int var6 = Math.clamp((long)((int)Math.floor(var4.m10000())), f128000[1], var3);
         int var7 = Math.clamp((long)((int)Math.ceil(var4.m12000())), f128000[2], var2);
         int var8 = Math.clamp((long)((int)Math.ceil(var4.m14000())), f128000[3], var3);
         int var9 = Math.max(f183000[0], var7 - var5);
         int var10 = Math.max(f183000[1], var8 - var6);
         int var11 = var3 - var8;
         GL11.glEnable(f199000[1]);
         GL11.glScissor(var5, var11, var9, var10);
      }
   }

   private int m44000() {
      return ((Iface0672)C1225.f3000[f126000[2]]).m2000();
   }

   private int m50000(int var1) {
      return this.f52000[f118000[2]] >= f56000[2] ? var1 : C0248.m14000(var1, (Float)this.f52000[f118000[3]]);
   }

   public void m52000() {
      float var10001;
      if ((Integer)this.f52000[f198000[2]] == 0) {
         var10001 = f56000[1];
      } else {
         float[] var7 = (float[])this.f166000[f198000[3]];
         int var10004 = (Integer)this.f52000[f198000[4]] - f37000[2];
         Integer var5 = var10004;
         this.f52000[f118000[0]] = var5;
         var10001 = var7[var10004];
      }

      Float var6 = var10001;
      this.f52000[f118000[1]] = var6;
   }

   private static void m60000() {
      f26000 = new double[]{1.0, 1.0};
   }

   private Rec0233 m64000() {
      return this.f109000[f146000[0]] == 0 ? null : this.m138000(((IlmOisOkp[])this.f109000[f146000[1]])[this.f109000[f169000[0]] - f102000[2]]);
   }

   private static void m68000() {
      f178000 = new byte[]{64, 64};
      f130000 = new byte[]{64, 64, 8, -1, 16, 16, 16};
      f45000 = new byte[]{8, 2, 2, 2, 24, 16};
      f129000 = new byte[]{8, 2, 4, 8, 16, 24, 8, 32};
      f80000 = new byte[]{16, 32, 7, 7, -1, -1, 8};
      f62000 = new byte[]{8, 64, 64, 64, 64, 64, 64, 64};
      f116000 = new byte[]{64, 64, 64, 24, 5};
      f212000 = new byte[]{2, 2};
      f133000 = new byte[]{3, 2, 6, 4, 2, 4, 2};
      f4000 = new byte[]{6, 5, 2, 2, 4, 2};
      f47000 = new byte[]{6, 6};
      f141000 = new byte[]{2, 3, 4, 2, 6, 7, 2, 4};
      f182000 = new byte[]{4, 2, 6};
      f158000 = new byte[]{2, 3, 4, 3, 2, 4, 3};
      f96000 = new byte[]{2, 2};
      f123000 = new byte[]{2, 4, 4, 3, 8, 4, 8};
      f209000 = new byte[]{4, 4, 8};
      f58000 = new byte[]{8, 3};
      f29000 = new byte[]{3, 4, 8, 4, 5, 6, 7};
      f78000 = new byte[]{4, 2};
      f55000 = new byte[]{2, 3, 2, 8};
      f174000 = new byte[]{2, 3, 4, 6};
      f204000 = new byte[]{7, 3, 7, 2, 6, 4};
      f8000 = new byte[]{2, 64, 3, 5};
      f60000 = new byte[]{2, 4, 3};
      f15000 = new byte[]{8, 4, 16, 5, 32, 64, 2};
      f68000 = new byte[]{3, 4, 8, 8, 7, 7, 5};
   }

   private void m72000() {
      if ((Iface0006)this.f77000[f165000[4]] != null) {
         ((Iface0006)this.f77000[f165000[5]]).m12000(f164000[0]);
      } else {
         this.m76000();
      }
   }

   private void m76000() {
      if ((Iface0006)this.f77000[f165000[6]] != null) {
         ((Iface0006)this.f77000[f165000[7]]).m12000(f164000[1]);
      } else {
         IlkOns.m94000(((NNuU)this.f113000[f64000[0]]).e(), f164000[2]);
      }
   }

   private static void m80000() {
      f148000 = new int[]{33992, 33984, 98304};
   }

   private void m84000() {
      if ((Integer)this.f166000[f188000[2]] == ((Matrix3x2f[])this.f109000[f188000[3]]).length) {
         Matrix3x2f[] var1 = new Matrix3x2f[((Matrix3x2f[])this.f109000[f188000[4]]).length * f45000[1]];
         System.arraycopy((Matrix3x2f[])this.f109000[f188000[5]], f179000[1], var1, f179000[2], ((Matrix3x2f[])this.f109000[f188000[6]]).length);
         this.f109000[f188000[7]] = var1;
      }

      Matrix3x2f var8 = ((Matrix3x2f[])this.f109000[f171000[0]])[this.f166000[f171000[1]]];
      if (var8 == null) {
         var8 = new Matrix3x2f();
         ((Matrix3x2f[])this.f109000[f171000[2]])[this.f166000[f171000[3]]] = var8;
      }

      var8.set((Matrix3x2f)this.f113000[f171000[4]]);
      Integer var7 = (Integer)this.f166000[f203000[0]] + f179000[3];
      this.f166000[f203000[1]] = var7;
   }

   private static void m86000() {
      f112000 = new short[]{0, 1, 2, 3, 0, 1};
      f39000 = new short[]{2, 3, 4, 5, 6};
      f44000 = new short[]{7, 0, 1, 2, 3};
      f144000 = new short[]{4, 5, 6};
      f117000 = new short[]{7, 0, 1, 2};
      f70000 = new short[]{0, 128, 2, 5, 2, 3};
      f186000 = new short[]{1, 1, 0, 1, 3, 4, 5};
      f73000 = new short[]{1, 3, 2, 0, 0, 0, 2, 4};
      f11000 = new short[]{0, 1, 5};
      f201000 = new short[]{6, 7};
      f172000 = new short[]{0, 1, 2, 6, 7, 6, 5, 0};
      f87000 = new short[]{0, 1, 2, 4, 1};
      f34000 = new short[]{2, 2, 2, 1, 1};
      f196000 = new short[]{1, 1, 3089};
      f149000 = new short[]{2, 3, 2};
      f28000 = new short[]{2, 0, 1, 1, 2};
      f200000 = new short[]{1, 1, 1, 1};
      f188000 = new short[]{2, 2, 0, 3, 3, 3, 3, 3};
      f171000 = new short[]{3, 0, 3, 0, 2};
      f203000 = new short[]{0, 0, 0, 2};
      f74000 = new short[]{4, 0, 0, 2, 3, 0, 0, 1};
      f191000 = new short[]{1, 1, 1, 1, 0, 0, 1};
      f198000 = new short[]{1, 1, 0, 1, 0};
      f118000 = new short[]{0, 1, 1, 1, 2, 1, 1};
      f207000 = new short[]{1, 1, 1, 1, 2, 2, 2, 2};
      f43000 = new short[]{2, 2, 1, 2, 1, 0, 1, 2};
      f103000 = new short[]{1, 1, 4, 4, 1, 1, 1, 2};
      f120000 = new short[]{1, 0, 4, 4};
      f159000 = new short[]{0, 1, 2, 0, 1, 0, 4, 2};
      f84000 = new short[]{3, 2, 1024, 5};
      f88000 = new short[]{0, 1, 0, 0, 0, 0};
      f125000 = new short[]{3, 0, 2, 1, 5, 5, 0, 6};
      f151000 = new short[]{7, 6, 7, 5, 0};
      f18000 = new short[]{0, 0, 0};
      f5000 = new short[]{0, 1};
      f122000 = new short[]{5, 5, 0};
      f165000 = new short[]{0, 0, 0, 0, 1, 1, 0, 0};
      f64000 = new short[]{0, 0, 2, 0, 3, 0, 0, 0};
      f205000 = new short[]{0, 3, 0, 4};
      f180000 = new short[]{3, 0, 4};
      f75000 = new short[]{0, 0, 0, 0};
      f51000 = new short[]{4, 4, 0, 4, 2, 3, 3, 3};
      f202000 = new short[]{3, 3, 3, 2};
      f139000 = new short[]{3, 2, 0};
      f36000 = new short[]{1, 2, 2, 2, 2, 1, 2, 1};
      f30000 = new short[]{0, 2, 2, 3, 4};
      f97000 = new short[]{2, 4, 4, 2, 2, 2, 1};
      f145000 = new short[]{2, 3, 4, 1, 2, 0};
      f100000 = new short[]{1, 0, 1, 2, 1, 4};
      f132000 = new short[]{5, 2, 1, 2, 3, 4, 5};
      f38000 = new short[]{5, 5, 5, 1};
      f131000 = new short[]{2, 0, 1};
      f152000 = new short[]{0, 2, 1, 2, 1, 4};
      f214000 = new short[]{1, 4, 1, 1};
      f76000 = new short[]{1, 1, 2, 2, 2, 3};
      f185000 = new short[]{3, 3, 4, 4, 4, 2};
      f111000 = new short[]{1, 2, 3, 4, 1, 2, 0, 1};
      f137000 = new short[]{0, 2, 1, 2, 3};
      f35000 = new short[]{4, 1, 2, 0, 1};
      f119000 = new short[]{0, 2, 0, 2};
      f156000 = new short[]{2, 2, 2, 0};
      f135000 = new short[]{2, 6, 7, 5, 3, 1};
      f27000 = new short[]{0, 7, 1, 6, 5, 6};
      f140000 = new short[]{7, 5, 6, 6, 6, 5, 5};
      f195000 = new short[]{6, 5, 5, 5, 0, 0};
      f155000 = new short[]{1, 3, 3, 2};
      f85000 = new short[]{2, 4, 2};
      f136000 = new short[]{1, 3089, 1};
      f90000 = new short[]{1, 1, 1, 2};
      f57000 = new short[]{1, 0, 4, 4, 2960, 4, 5};
      f82000 = new short[]{6, 1};
      f20000 = new short[]{7, 2, 0, 0, 0, 4, 1};
      f184000 = new short[]{5, 1, 2};
      f127000 = new short[]{0, 6, 7, 0, 1, 0};
      f107000 = new short[]{1, 0, 0, 2, 0, 0};
      f210000 = new short[]{0, 1, 1, 0, 0, 0, 0, 0};
      f108000 = new short[]{1, 6, 0, 6, 1};
      f104000 = new short[]{0, 2, 2, 6};
      f150000 = new short[]{0, 7, 1, 4, 5, 1};
      f13000 = new short[]{6, 2, 7};
      f67000 = new short[]{0, 0, 4, 0, 5, 1, 1};
      f99000 = new short[]{1, 1};
      f66000 = new short[]{2, 0, 1, 6, 7, 6, 7};
      f146000 = new short[]{1, 2};
      f169000 = new short[]{1, 1, 1, 1, 2, 0, 1, 2};
      f6000 = new short[]{3, 2};
      f175000 = new short[]{3, 2, 2, 0, 1};
      f105000 = new short[]{0, 0, 1, 1, 1, 1, 3};
      f21000 = new short[]{0, 3, 3, 0, 0, 1, 2, 3};
      f110000 = new short[]{4, 1, 2, 3};
      f95000 = new short[]{4, 1, 2, 3, 4, 1, 2};
      f213000 = new short[]{3, 4};
      f71000 = new short[]{1, 2, 3, 4};
      f126000 = new short[]{4, 4, 0, 1, 1, 1};
      f25000 = new short[]{3089, 0};
      f199000 = new short[]{1, 3089, 1, 3089, 6, 2, 3, 1};
      f197000 = new short[]{6, 7, 0, 0};
      f79000 = new short[]{5, 5, 5, 5};
      f48000 = new short[]{0, 1, 4096, 1024, 256, 512, 1024};
   }

   private static void m90000() {
      f167000 = new boolean[]{true, true};
      f187000 = new boolean[]{true, true, true, true, true, false};
      f121000 = new boolean[]{false, false, false, false, false, false, false};
      f32000 = new boolean[]{false, false};
      f101000 = new boolean[]{false, false, true, true, true, true};
      f142000 = new boolean[]{true, true, false, true, true};
      f179000 = new boolean[]{false, false, false, true};
      f37000 = new boolean[]{true, true, true, false, false};
      f170000 = new boolean[]{true, true, true, true, true, true};
      f83000 = new boolean[]{true, false};
      f190000 = new boolean[]{false, true, true, false, true, true, false, false};
      f164000 = new boolean[]{true, true, true, true};
      f94000 = new boolean[]{true, true, true, true, false, false, false, false};
      f193000 = new boolean[]{true, false, true, true, false, true, false, false};
      f14000 = new boolean[]{true, true, true};
      f9000 = new boolean[]{false, false, false, true, false, false, false, false};
      f215000 = new boolean[]{false, true, false, false, false, true, true};
      f12000 = new boolean[]{true, true, false, true, true};
      f153000 = new boolean[]{false, false, false, false, true, false, true, true};
      f102000 = new boolean[]{false, false, true, false};
      f161000 = new boolean[]{false, true, true, false, false, false, false};
      f181000 = new boolean[]{false, true, true, false};
      f114000 = new boolean[]{true, false, false, true, true};
      f128000 = new boolean[]{false, false, false, false};
      f183000 = new boolean[]{false, false};
      f93000 = new boolean[]{false, true, false, true};
      f91000 = new boolean[]{false, false};
      f3000 = new boolean[]{false, false, false, false, false, false};
      f40000 = new boolean[]{true, false, false, false};
      f31000 = new boolean[]{false, false, true, false};
      f92000 = new boolean[]{false, true, false, false, false, false};
      f23000 = new boolean[]{true, false};
      f72000 = new boolean[]{false, false, false, false, false, true, false};
      f173000 = new boolean[]{false, true};
      f115000 = new boolean[]{false, true, true, false, true, true, false, true};
   }

   private Rec0233 m94000() {
      Rec0233 var1 = null;
      if (!((Deque)this.f113000[f169000[1]]).isEmpty()) {
         Rec0236 var2 = (Rec0236)((Deque)this.f113000[f169000[2]]).peek();
         var1 = new Rec0233(var2.m2000(), var2.m10000(), var2.m8000(), var2.m20000(), new Vector4f());
      }

      for (int var4 = f102000[3]; var4 < this.f109000[f169000[3]]; var4++) {
         Rec0233 var3 = this.m138000(((IlmOisOkp[])this.f109000[f169000[4]])[var4]);
         if (var3 != null) {
            var1 = var1 == null ? var3 : var1.m20000(var3);
            if (var1 == null) {
               return null;
            }
         }
      }

      return var1;
   }

   private void m98000(String var1) {
      Integer var6 = (Integer)this.f77000[f140000[2]] + f215000[5];
      this.f77000[f140000[3]] = var6;
      if ((Integer)this.f77000[f140000[4]] > f215000[6]) {
         ((StringBuilder)this.f77000[f140000[5]]).append(f206000[2]);
      }

      ((StringBuilder)this.f77000[f140000[6]]).append(var1);
   }

   private static void m100000() {
      f208000 = new Object[]{null, 512, 64, 1.0E-4F};
      f138000 = new Object[]{0.85F, 1, 4, 8, 16};
      f2000 = new Object[]{32, 64, 1024, 1, 8};
      f41000 = new Object[]{7, 7, null, null, null, null, null, null};
      f53000 = new Object[]{null, null, null, null, null};
   }

   private boolean m102000() {
      if (((Deque)this.f113000[f126000[3]]).isEmpty()) {
         return f114000[2];
      } else {
         Rec0236 var1 = (Rec0236)((Deque)this.f113000[f126000[4]]).peek();
         return this.m198000(var1.m8000(), var1.m20000());
      }
   }

   private Iface0003 m104000(int var1) {
      if ((Iface0003)this.f46000[f125000[4]] != null) {
         return (Iface0003)this.f46000[f125000[5]];
      } else {
         ow var2 = ((NNuU)this.f113000[f125000[6]]).Nt();
         Integer var7 = Math.max(f190000[4], var2.U());
         this.f46000[f125000[7]] = var7;
         Integer var8 = Math.max(f190000[5], var2.E());
         this.f46000[f151000[0]] = var8;
         Iface0003 var9 = this.m216000(f190000[6], f190000[7], (Integer)this.f46000[f151000[1]], (Integer)this.f46000[f151000[2]], var1);
         this.f46000[f151000[3]] = var9;
         Float var10 = ((rw.core.C0014)this.f22000[f151000[4]]).m6000() - ((rw.core.C0014)this.f22000[f18000[0]]).m74000();
         this.f33000[f18000[1]] = var10;
         Float var11 = ((rw.core.C0014)this.f22000[f18000[2]]).m50000() - ((rw.core.C0014)this.f22000[f5000[0]]).m44000();
         this.f33000[f5000[1]] = var11;
         if ((Iface0003)this.f46000[f122000[0]] != null) {
            this.m98000(f134000[3]);
         }

         return (Iface0003)this.f46000[f122000[1]];
      }
   }

   private void m108000() {
      if ((Integer)this.f166000[f203000[2]] == 0) {
         ((Matrix3x2f)this.f113000[f203000[3]]).identity().scale((Float)this.f46000[f74000[0]]);
      } else {
         Integer var5 = (Integer)this.f166000[f74000[1]] - f37000[0];
         this.f166000[f74000[2]] = var5;
         ((Matrix3x2f)this.f113000[f74000[3]]).set(((Matrix3x2f[])this.f109000[f74000[4]])[this.f166000[f74000[5]]]);
      }
   }

   public void m114000() {
      if ((Integer)this.f109000[f103000[4]] > 0) {
         Integer var5 = (Integer)this.f109000[f103000[5]] - f170000[2];
         this.f109000[f103000[6]] = var5;
         IlmOisOkp var10000 = ((IlmOisOkp[])this.f109000[f103000[7]])[this.f109000[f120000[0]]];
         Object var6 = null;
         var10000.f1000[f120000[1]] = var6;
         Integer var7 = (Integer)this.f162000[f120000[2]] + f170000[3];
         this.f162000[f120000[3]] = var7;
      }
   }

   private boolean m116000(int var1) {
      if (var1 <= 0) {
         return f9000[5];
      } else {
         Integer var6 = this.m146000((int[])this.f86000[f119000[1]], var1);
         this.f89000[f119000[2]] = var6;
         return (Boolean)this.f46000[f119000[3]];
      }
   }

   public NNBK m120000() {
      return (NNBK)this.f33000[f73000[2]];
   }

   private void m126000(OlpOtr var1) {
      int var2 = (Iface0003)this.f46000[f195000[2]] != null ? ((Iface0003)this.f46000[f195000[3]]).m4000() : this.m44000();
      var1.m10000(f157000[0]).m4000(f148000[0], var2);
      ow var3 = ((NNuU)this.f113000[f195000[4]]).Nt();
      var1.m106000(f157000[1]).m18000(Math.max(f12000[0], var3.U()), Math.max(f12000[1], var3.E()));
      var1.m106000(f81000[0]).m18000((Float)this.f33000[f195000[5]], (Float)this.f33000[f155000[0]]);
   }

   private void m128000(boolean var1) {
      if ((Boolean)this.f46000[f67000[6]] != var1) {
         this.m242000(f81000[3]);
         Boolean var6 = var1;
         this.f46000[f99000[0]] = var6;
      }
   }

   private void m130000(float var1) {
      float var2 = ((Vector2f)this.f17000[f152000[1]]).x - ((Vector2f)this.f17000[f152000[2]]).x;
      float var3 = ((Vector2f)this.f17000[f152000[3]]).y - ((Vector2f)this.f17000[f152000[4]]).y;
      float var4 = var2 * var2 + var3 * var3;
      if (var4 > f10000[1]) {
         float var5 = (float)(f26000[0] / Math.sqrt(var4));
         var2 *= var5;
         var3 *= var5;
      }

      float var12 = ((Vector2f)this.f17000[f152000[5]]).x - ((Vector2f)this.f17000[f214000[0]]).x;
      float var6 = ((Vector2f)this.f17000[f214000[1]]).y - ((Vector2f)this.f17000[f214000[2]]).y;
      float var7 = var12 * var12 + var6 * var6;
      if (var7 > f154000[0]) {
         float var8 = (float)(f26000[1] / Math.sqrt(var7));
         var12 *= var8;
         var6 *= var8;
      }

      float var13 = var2 * var1;
      float var9 = var3 * var1;
      float var10 = var12 * var1;
      float var11 = var6 * var1;
      ((Vector2f)this.f17000[f214000[3]]).set(((Vector2f)this.f17000[f76000[0]]).x - var13 - var10, ((Vector2f)this.f17000[f76000[1]]).y - var9 - var11);
      ((Vector2f)this.f17000[f76000[2]]).set(((Vector2f)this.f17000[f76000[3]]).x + var13 - var10, ((Vector2f)this.f17000[f76000[4]]).y + var9 - var11);
      ((Vector2f)this.f17000[f76000[5]]).set(((Vector2f)this.f17000[f185000[0]]).x + var13 + var10, ((Vector2f)this.f17000[f185000[1]]).y + var9 + var11);
      ((Vector2f)this.f17000[f185000[2]]).set(((Vector2f)this.f17000[f185000[3]]).x - var13 + var10, ((Vector2f)this.f17000[f185000[4]]).y - var9 + var11);
   }

   private boolean m132000(int var1) {
      return var1 >>> f116000[3] != 0 ? f181000[2] : f181000[3];
   }

   private void m134000() {
      if ((Integer)this.f162000[f57000[5]] == (Integer)this.f162000[f57000[6]]) {
         Integer var6 = (Integer)this.f162000[f82000[0]];
         this.f89000[f82000[1]] = var6;
         Integer var7 = (Integer)this.f162000[f20000[0]];
         this.f89000[f20000[1]] = var7;
         Integer var8 = (Integer)this.f109000[f20000[2]];
         this.f46000[f20000[3]] = var8;
         ((Vector4f)this.f147000[f20000[4]]).set((Vector4f)this.f147000[f20000[5]]);
         ((Vector4f)this.f147000[f20000[6]]).set((Vector4f)this.f147000[f184000[0]]);
      } else {
         Integer var9 = Integer.valueOf(f153000[0]);
         this.f89000[f184000[1]] = var9;
         Integer var10 = Integer.valueOf(f153000[1]);
         this.f89000[f184000[2]] = var10;
         Integer var11 = Integer.valueOf(f153000[2]);
         this.f46000[f127000[0]] = var11;
         ((Vector4f)this.f17000[f127000[1]]).set(f69000[2]);
         ((Vector4f)this.f17000[f127000[2]]).set(f69000[3]);
         ((Vector4f)this.f147000[f127000[3]]).set(f69000[4]);
         ((Vector4f)this.f147000[f127000[4]]).set(f69000[5]);
         this.m236000((C1128)this.f86000[f127000[5]], (C1128)this.f86000[f107000[0]]);
         if (((C1128)this.f86000[f107000[1]]).isEmpty()) {
            this.m128000(f153000[3]);
         } else if (((C1128)this.f86000[f107000[2]]).m6000() == f153000[4]) {
            this.m128000(f153000[5]);
            Integer var12 = Integer.valueOf(f153000[6]);
            this.f89000[f107000[3]] = var12;
            Integer var13 = Integer.valueOf(f62000[1]);
            this.f46000[f107000[4]] = var13;
            ((Vector4f)this.f147000[f107000[5]]).set((Vector4fc)((C1128)this.f86000[f210000[0]]).getFirst());
            ((Vector4f)this.f147000[f210000[1]]).set((Vector4fc)((C1128)this.f86000[f210000[2]]).getFirst());
         } else {
            if (((C1128)this.f86000[f210000[3]]).m6000() > f62000[2]) {
               ((Logger)f208000[f210000[4]]).warn(f81000[1], ((C1128)this.f86000[f210000[5]]).m6000(), Integer.valueOf(f62000[3]));

               while (((C1128)this.f86000[f210000[6]]).m6000() > f62000[4]) {
                  ((C1128)this.f86000[f210000[7]]).m22000();
                  ((C1128)this.f86000[f108000[0]]).m22000();
               }
            }

            this.m128000(f153000[7]);
            if (((C1128)this.f147000[f108000[1]]).m6000() + ((C1128)this.f86000[f108000[2]]).m6000() > f62000[5]) {
               this.m242000(f81000[2]);
            }

            Integer var14 = ((C1128)this.f147000[f108000[3]]).m6000();
            this.f89000[f108000[4]] = var14;
            Integer var15 = ((C1128)this.f86000[f104000[0]]).m6000();
            this.f89000[f104000[1]] = var15;

            for (int var1 = f102000[0]; var1 < this.f89000[f104000[2]]; var1++) {
               ((C1128)this.f147000[f104000[3]]).m26000(((C1128)this.f86000[f150000[0]]).m24000(var1));
               ((C1128)this.f147000[f150000[1]]).m26000(((C1128)this.f86000[f150000[2]]).m24000(var1));
            }
         }

         Integer var16 = (Integer)this.f162000[f150000[3]];
         this.f162000[f150000[4]] = var16;
         Integer var17 = (Integer)this.f89000[f150000[5]];
         this.f162000[f13000[0]] = var17;
         Integer var18 = (Integer)this.f89000[f13000[1]];
         this.f162000[f13000[2]] = var18;
         Integer var19 = (Integer)this.f46000[f67000[0]];
         this.f109000[f67000[1]] = var19;
         ((Vector4f)this.f147000[f67000[2]]).set((Vector4f)this.f147000[f67000[3]]);
         ((Vector4f)this.f147000[f67000[4]]).set((Vector4f)this.f147000[f67000[5]]);
      }
   }

   private Rec0233 m138000(IlmOisOkp var1) {
      return !this.m238000(
            (Iface0215)var1.f1000[f169000[5]], (Matrix3x2f)var1.f1000[f169000[6]], (Vector4f)this.f147000[f169000[7]], (Vector4f)this.f147000[f6000[0]]
         )
         ? null
         : new Rec0233((Vector4f)this.f147000[f6000[1]], (Vector4f)this.f147000[f175000[0]]);
   }

   private void m142000(Iface0006 var1, Iface0006 var2, float var3) {
      if ((Integer)this.f77000[f51000[4]] == ((C1120[])this.f77000[f51000[5]]).length) {
         C1120[] var4 = new C1120[((C1120[])this.f77000[f51000[6]]).length * f129000[1]];
         System.arraycopy((C1120[])this.f77000[f51000[7]], f94000[6], var4, f94000[7], ((C1120[])this.f77000[f202000[0]]).length);
         this.f77000[f202000[1]] = var4;
      }

      C1120 var14 = ((C1120[])this.f77000[f202000[2]])[this.f77000[f202000[3]]];
      if (var14 == null) {
         var14 = new C1120();
         ((C1120[])this.f77000[f139000[0]])[this.f77000[f139000[1]]] = var14;
      }

      var14.f1000[f139000[2]] = var1;
      var14.f1000[f36000[0]] = var2;
      Float var12 = var3;
      var14.f1000[f36000[1]] = var12;
      Integer var13 = (Integer)this.f77000[f36000[2]] + f193000[0];
      this.f77000[f36000[3]] = var13;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void m144000(NNBK var1, C0346 var2, float var3) {
      this.f33000[f73000[6]] = var1;
      boolean var25 = false /* VF: Semaphore variable */;

      try {
         var25 = true;
         Float var10 = var3;
         this.f46000[f73000[7]] = var10;
         Integer var11 = Integer.valueOf(f121000[0]);
         this.f89000[f11000[0]] = var11;
         Boolean var12 = f121000[1];
         this.f46000[f11000[1]] = var12;
         Object var13 = null;
         this.f46000[f11000[2]] = var13;
         Integer var14 = Integer.valueOf(f121000[2]);
         this.f46000[f201000[0]] = var14;
         Integer var15 = Integer.valueOf(f121000[3]);
         this.f46000[f201000[1]] = var15;
         Float var16 = f16000[1];
         this.f33000[f172000[0]] = var16;
         Float var17 = f16000[2];
         this.f33000[f172000[1]] = var17;
         Arrays.fill((int[])this.f86000[f172000[2]], f121000[4]);
         ((C1128)this.f147000[f172000[3]]).m10000();
         ((C1128)this.f147000[f172000[4]]).m10000();
         this.m2000();
         this.m28000();
         this.m262000();
         Integer var18 = Integer.valueOf(f121000[5]);
         this.f77000[f172000[5]] = var18;
         ((StringBuilder)this.f77000[f172000[6]]).setLength(f121000[6]);
         Integer var19 = Integer.valueOf(f32000[0]);
         this.f166000[f172000[7]] = var19;
         Integer var20 = Integer.valueOf(f32000[1]);
         this.f52000[f87000[0]] = var20;
         Float var21 = f16000[3];
         this.f52000[f87000[1]] = var21;
         ((Matrix3x2f)this.f113000[f87000[2]]).identity().scale((Float)this.f46000[f87000[3]]);
         ((C1072)this.f22000[f87000[4]]).m54000();
         C0340.m2000(var2.m8000(), this);
         this.m38000(f194000[0]);
         this.m2000();
         this.m28000();
         this.m262000();
         var25 = false;
      } finally {
         if (var25) {
            Object var23 = null;
            this.f33000[f34000[1]] = var23;
         }
      }

      Object var22 = null;
      this.f33000[f34000[0]] = var22;
   }

   private int m146000(int[] var1, int var2) {
      Boolean var8 = f9000[6];
      this.f46000[f156000[0]] = var8;

      for (int var3 = f9000[7]; var3 < var1.length; var3++) {
         if (var1[var3] == var2) {
            return var3;
         }
      }

      for (int var10 = f215000[0]; var10 < var1.length; var10++) {
         if (var1[var10] == 0) {
            var1[var10] = var2;
            return var10;
         }
      }

      if (((C0830)f41000[f156000[1]]).m6000().m16000() > 0) {
         this.m242000(f206000[1]);
         Boolean var9 = f215000[1];
         this.f46000[f156000[2]] = var9;
      }

      Arrays.fill(var1, f215000[2]);
      var1[f215000[3]] = var2;
      return f215000[4];
   }

   private void m148000(Vector4fc var1, float var2, float var3, float var4, Vector4f var5) {
      float var6 = Math.max(f65000[1], var1.x() * var4);
      float var7 = Math.max(f65000[2], var1.y() * var4);
      float var8 = Math.max(f65000[3], var1.z() * var4);
      float var9 = Math.max(f65000[4], var1.w() * var4);
      float var10 = f65000[5];
      var10 = this.m194000(var10, var2, var9 + var8);
      var10 = this.m194000(var10, var2, var7 + var6);
      var10 = this.m194000(var10, var3, var9 + var7);
      var10 = this.m194000(var10, var3, var8 + var6);
      var5.set(var6 * var10, var7 * var10, var8 * var10, var9 * var10);
   }

   private void m150000(Matrix3x2f var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11) {
      this.m134000();
      if (this.m116000(var11)) {
         this.m134000();
      }

      this.m170000(var1, var2, var3, var4, var5);
      C0806.m44000(
         (C0830)f41000[f185000[5]],
         (Vector2f)this.f17000[f111000[0]],
         (Vector2f)this.f17000[f111000[1]],
         (Vector2f)this.f17000[f111000[2]],
         (Vector2f)this.f17000[f111000[3]],
         var10,
         var6,
         var7,
         var8,
         var9,
         f154000[1],
         f154000[2],
         f154000[3],
         f69000[0],
         f9000[1],
         f9000[2],
         (Integer)this.f89000[f111000[4]],
         (Integer)this.f89000[f111000[5]],
         (Vector4f)this.f147000[f111000[6]],
         (Vector4f)this.f147000[f111000[7]],
         f9000[3] | (Integer)this.f46000[f137000[0]] | this.m32000()
      );
   }

   private void m152000(Matrix3x2f var1, float var2, float var3, Vector2f var4) {
      var4.set(var2, var3);
      var1.transformPosition(var4);
   }

   public void m154000(float var1, float var2, float var3, float var4) {
      Rec0236 var5 = this.m174000(var1, var2, var3, var4, (Matrix3x2f)this.f113000[f118000[4]]);
      if (!((Deque)this.f113000[f118000[5]]).isEmpty()) {
         Rec0236 var6 = ((Rec0236)((Deque)this.f113000[f118000[6]]).peek()).m16000(var5);
         var5 = var6 == null ? new Rec0236(f56000[3], f56000[4], f56000[5], f56000[6]) : var6;
      }

      this.m38000(f194000[3]);
      ((Deque)this.f113000[f207000[0]]).push(var5);
      this.m40000();
   }

   private void m156000(Iface0003 var1, float var2) {
      this.m178000(var1, var2, f1000[2], f42000[0], f42000[1], f42000[2]);
   }

   private void m158000(
      Matrix3x2f var1, float var2, float var3, float var4, float var5, Vector4fc var6, int var7, float var8, int var9, int var10, float var11, int var12
   ) {
      this.m134000();
      this.m170000(var1, var2, var3, var4, var5);
      float var13 = ((Vector2f)this.f17000[f100000[2]]).distance((Vector2f)this.f17000[f100000[3]]);
      float var14 = ((Vector2f)this.f17000[f100000[4]]).distance((Vector2f)this.f17000[f100000[5]]);
      if (!(var13 <= f106000[2]) && !(var14 <= f106000[3])) {
         float var15 = var4 <= f106000[4] ? f106000[5] : var13 / var4;
         float var16 = var5 <= f106000[6] ? f106000[7] : var14 / var5;
         float var17 = Math.min(var15, var16);
         float var18 = Math.max(f124000[0], var8 * var17);
         float var19 = Math.max(f124000[1], var11 * var17);
         this.m148000(var6, var13, var14, var17, (Vector4f)this.f17000[f132000[0]]);
         float var20 = f63000[0];
         if ((var12 & f80000[0]) != 0) {
            var20 = var19 * f63000[1];
         }

         if (var20 > f10000[0]) {
            this.m130000(var20);
         }

         C0806.m44000(
            (C0830)f41000[f132000[1]],
            (Vector2f)this.f17000[f132000[2]],
            (Vector2f)this.f17000[f132000[3]],
            (Vector2f)this.f17000[f132000[4]],
            (Vector2f)this.f17000[f132000[5]],
            var7,
            ((Vector4f)this.f17000[f132000[6]]).z(),
            ((Vector4f)this.f17000[f38000[0]]).w(),
            ((Vector4f)this.f17000[f38000[1]]).y(),
            ((Vector4f)this.f17000[f38000[2]]).x(),
            var13,
            var14,
            var18,
            var19,
            var9,
            var10,
            (Integer)this.f89000[f38000[3]],
            (Integer)this.f89000[f131000[0]],
            (Vector4f)this.f147000[f131000[1]],
            (Vector4f)this.f147000[f131000[2]],
            var12 | (Integer)this.f46000[f152000[0]]
         );
      }
   }

   private void m160000(Iface0003 var1, Rec0109 var2, float var3) {
      ow var4 = ((NNuU)this.f113000[f180000[1]]).Nt();
      int var5 = Math.max(f94000[1], var4.U());
      int var6 = Math.max(f94000[2], var4.E());
      int var7 = Math.max(f94000[3], Math.round(var2.m4000() * (Float)this.f46000[f180000[2]]));
      Iface0003 var8 = this.m232000(var1, var5, var6, f94000[4], f94000[5], var5, var6, var7);
      if (var8 == null) {
         this.m156000(var1, var3);
      } else {
         this.m178000(
            var8,
            var3,
            ((rw.core.C0014)this.f22000[f75000[0]]).m74000(),
            ((rw.core.C0014)this.f22000[f75000[1]]).m50000(),
            ((rw.core.C0014)this.f22000[f75000[2]]).m6000(),
            ((rw.core.C0014)this.f22000[f75000[3]]).m44000()
         );
      }
   }

   private void m162000(Rec0110 var1) {
      if (!this.m102000()) {
         this.m236000((C1128)this.f86000[f159000[0]], (C1128)this.f86000[f159000[1]]);
         Rec0233 var2 = this.m64000();
         Rec0233 var3 = this.m94000();
         this.m38000(f61000[1]);
         Rec0236 var4 = this.m174000(var1.m10000(), var1.m2000(), var1.m8000(), var1.m6000(), (Matrix3x2f)this.f113000[f159000[2]]);
         C1057.m20000((C1128)this.f86000[f159000[3]], (C1128)this.f86000[f159000[4]], var2, var3);
         ow var5 = ((NNuU)this.f113000[f159000[5]]).Nt();

         try {
            var1.m12000()
               .m2000(
                  new Rec0117(
                     var4.m2000(),
                     var4.m10000(),
                     var4.m8000(),
                     var4.m20000(),
                     Math.max(f170000[4], var5.U()),
                     Math.max(f170000[5], var5.E()),
                     (Float)this.f46000[f159000[6]]
                  )
               );
         } finally {
            C1057.m2000();
            this.m72000();
         }

         this.m98000(f134000[0]);
      }
   }

   private void m164000(Rec0121 var1) {
      this.m188000(var1.m16000(), var1.m14000(), var1.m2000(), var1.m12000(), var1.m10000(), var1.m18000(), var1.m4000(), var1.m8000());
   }

   private void m166000(OlpOtr var1, int[] var2, int var3) {
      if ((OlpOtr)this.f162000[f155000[1]] != var1) {
         this.f162000[f155000[2]] = var1;
         C1239[] var12 = new C1239[f80000[6]];
         this.f162000[f155000[3]] = var12;
      }

      for (int var4 = f12000[2]; var4 < f62000[0]; var4++) {
         C1239 var5 = ((C1239[])this.f162000[f85000[0]])[var4];
         if (var5 == null) {
            var5 = var1.m10000(((String[])f53000[f85000[1]])[var4]);
            ((C1239[])this.f162000[f85000[2]])[var4] = var5;
         }

         int var6 = var2[var4] == 0 ? var3 : var2[var4];
         var5.m4000(f148000[1] + var4, var6);
      }
   }

   private void m168000(OlpOtr var1, List<Vector4f> var2, List<Vector4f> var3, boolean var4) {
      int var5 = Math.min(Math.min(var2.size(), var3.size()), f116000[0]);
      if (!var4) {
         if (var5 == f161000[1]) {
            Vector4f var18 = (Vector4f)var2.getFirst();
            Vector4f var19 = (Vector4f)var3.getFirst();
            var1.m6000(f81000[4]).m20000(f161000[2]);
            var1.m94000(f81000[5]).m18000(var18.x(), var18.y(), var18.z(), var18.w());
            var1.m94000(f211000[0]).m18000(var19.x(), var19.y(), var19.z(), var19.w());
         } else {
            var1.m6000(f211000[1]).m20000(f161000[3]);
         }
      } else {
         if ((OlpOtr)this.f162000[f105000[4]] != var1) {
            this.f162000[f105000[5]] = var1;
            C1250[] var16 = new C1250[f116000[1]];
            this.f7000[f105000[6]] = var16;
            C1250[] var17 = new C1250[f116000[2]];
            this.f162000[f21000[0]] = var17;
         }

         var1.m6000(f50000[0]).m20000(var5);
         var1.m6000(f50000[1]).m20000(f161000[4]);

         for (int var6 = f161000[5]; var6 < var5; var6++) {
            C1250 var7 = ((C1250[])this.f7000[f21000[1]])[var6];
            if (var7 == null) {
               var7 = var1.m94000("u_clip_rects[" + var6 + "]");
               ((C1250[])this.f7000[f21000[2]])[var6] = var7;
            }

            C1250 var8 = ((C1250[])this.f162000[f21000[3]])[var6];
            if (var8 == null) {
               var8 = var1.m94000("u_clip_rounds[" + var6 + "]");
               ((C1250[])this.f162000[f21000[4]])[var6] = var8;
            }

            Vector4f var9 = (Vector4f)var2.get(var6);
            Vector4f var10 = (Vector4f)var3.get(var6);
            var7.m18000(var9.x(), var9.y(), var9.z(), var9.w());
            var8.m18000(var10.x(), var10.y(), var10.z(), var10.w());
         }
      }
   }

   private void m170000(Matrix3x2f var1, float var2, float var3, float var4, float var5) {
      this.m152000(var1, var2, var3, (Vector2f)this.f17000[f71000[0]]);
      this.m152000(var1, var2 + var4, var3, (Vector2f)this.f17000[f71000[1]]);
      this.m152000(var1, var2 + var4, var3 + var5, (Vector2f)this.f17000[f71000[2]]);
      this.m152000(var1, var2, var3 + var5, (Vector2f)this.f17000[f71000[3]]);
   }

   public void m172000(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.m84000();
      ((Matrix3x2f)this.f113000[f188000[0]]).translate(var1, var2);
      if (var5 != f189000[0] || var6 != f189000[1]) {
         ((Matrix3x2f)this.f113000[f188000[1]]).translate(var3, var4).rotate((float)Math.toRadians(var6)).scale(var5, var5).translate(-var3, -var4);
      }
   }

   private Rec0236 m174000(float var1, float var2, float var3, float var4, Matrix3x2f var5) {
      this.m170000(var5, var1, var2, var3, var4);
      float var6 = Math.min(
         Math.min(((Vector2f)this.f17000[f21000[5]]).x, ((Vector2f)this.f17000[f21000[6]]).x),
         Math.min(((Vector2f)this.f17000[f21000[7]]).x, ((Vector2f)this.f17000[f110000[0]]).x)
      );
      float var7 = Math.min(
         Math.min(((Vector2f)this.f17000[f110000[1]]).y, ((Vector2f)this.f17000[f110000[2]]).y),
         Math.min(((Vector2f)this.f17000[f110000[3]]).y, ((Vector2f)this.f17000[f95000[0]]).y)
      );
      float var8 = Math.max(
         Math.max(((Vector2f)this.f17000[f95000[1]]).x, ((Vector2f)this.f17000[f95000[2]]).x),
         Math.max(((Vector2f)this.f17000[f95000[3]]).x, ((Vector2f)this.f17000[f95000[4]]).x)
      );
      float var9 = Math.max(
         Math.max(((Vector2f)this.f17000[f95000[5]]).y, ((Vector2f)this.f17000[f95000[6]]).y),
         Math.max(((Vector2f)this.f17000[f213000[0]]).y, ((Vector2f)this.f17000[f213000[1]]).y)
      );
      return new Rec0236(var6, var7, var8, var9);
   }

   private void m178000(Iface0003 var1, float var2, float var3, float var4, float var5, float var6) {
      this.m210000(var1, var2, var3, var4, var5, var6, RenderSystem.getModelViewMatrix());
   }

   public boolean m180000(Rec0119 var1, TextRenderable$Styled var2) {
      if (var1 != null && !var1.m12000()) {
         this.m38000(f194000[1]);
         Iface0006 var3 = this.m246000((Integer)this.f77000[f34000[2]]);
         this.m142000(var3, (Iface0006)this.f77000[f34000[3]], (Float)this.f52000[f34000[4]]);
         this.f77000[f196000[0]] = var3;
         Float var9 = f24000[0];
         this.f52000[f196000[1]] = var9;
         var3.m12000(f101000[2]);
         GL11.glDisable(f196000[2]);
         GL11.glColorMask(f101000[3], f101000[4], f101000[5], f142000[0]);
         GL11.glClearColor(f24000[1], f24000[2], f24000[3], f24000[4]);
         var3.m16000(f142000[1], f142000[2]);
         this.m40000();
         return f142000[3];
      } else {
         return f101000[1];
      }
   }

   private void m182000(Rec0114 var1) {
      this.m188000(var1.m12000(), var1.m10000(), var1.m2000(), var1.m8000(), var1.m6000(), var1.m14000(), f193000[4], f177000[4]);
   }

   private void m184000(Rec0115 var1) {
      float var2 = var1.m10000();
      float var3 = var1.m8000();
      if (!this.m198000(var2, var3) && !this.m102000() && this.m132000(var1.m16000())) {
         Rec0232 var4 = ((C1072)this.f22000[f36000[7]]).m60000(var1.m14000());
         if (var4.m14000()) {
            int var5 = this.m50000(var1.m16000());
            Rec0068 var6 = var1.m4000();
            float var7 = var4.m22000();
            float var8 = var4.m16000();
            float var9 = var4.m2000();
            float var10 = var4.m48000();
            float var11;
            float var12;
            float var13;
            float var14;
            if (var6 != null && !var6.m12000()) {
               var11 = var7 + (var9 - var7) * var6.m10000();
               var12 = var8 + (var10 - var8) * var6.m2000();
               var13 = var7 + (var9 - var7) * var6.m8000();
               var14 = var8 + (var10 - var8) * var6.m6000();
            } else {
               var11 = var7;
               var12 = var8;
               var13 = var9;
               var14 = var10;
            }

            switch (((int[])C1118.f1000[f30000[0]])[var4.m20000().ordinal()]) {
               case 1:
                  float var15 = var4.m38000();
                  float var16 = var3 <= f143000[6] ? f143000[7] : var2 / var3;
                  float var17;
                  float var18;
                  if (var15 >= var16) {
                     var17 = var2;
                     var18 = var15 <= f177000[0] ? var3 : var2 / var15;
                  } else {
                     var18 = var3;
                     var17 = var3 * var15;
                  }

                  float var19 = var1.m12000() + (var2 - var17) * f177000[1];
                  float var20 = var1.m2000() + (var3 - var18) * f177000[2];
                  float var21 = Math.max(var4.m6000(), f177000[3]);
                  this.m202000(
                     (Matrix3x2f)this.f113000[f30000[1]],
                     var19,
                     var20,
                     var17,
                     var18,
                     var11,
                     var12,
                     var13,
                     var14,
                     var5,
                     var4.m26000(),
                     var21 / Math.max(f193000[2], var4.m32000()),
                     var21 / Math.max(f193000[3], var4.m12000())
                  );
                  break;
               case 2:
                  this.m150000((Matrix3x2f)this.f113000[f30000[2]], var1.m12000(), var1.m2000(), var2, var3, var11, var12, var13, var14, var5, var4.m26000());
            }
         }
      }
   }

   public int m186000() {
      return (Integer)this.f77000[f199000[4]];
   }

   private void m188000(String var1, float var2, float var3, int var4, float var5, Rec0036 var6, int var7, float var8) {
      if (var1 != null && !var1.isEmpty() && !this.m102000() && this.m132000(var4)) {
         ZwBs var9 = C0002.m40000(var6.m8000());
         if (var9 != null) {
            var9.m46000();
            OlmmOsl var10 = OlmmOsl.m44000(var6.m6000()).orElse((OlmmOsl)OlmmOsl.f7000[f30000[3]]);
            boolean var11 = var6.m2000() == Enum0027.f2000 ? f193000[5] : f193000[6];
            Rec0249 var12 = new Rec0249(var1, var6.m8000(), var10, var11, var5, (Float)this.f46000[f30000[4]]);
            List var13 = (List)((LinkedHashMap)this.f22000[f97000[0]]).get(var12);
            float var14 = this.m10000(var2);
            float var15 = this.m10000(var3);
            int var16 = this.m50000(var4);
            int var17 = this.m50000(var7);
            float var18 = var8 > f177000[5] && this.m132000(var17) ? var8 * (Float)this.f46000[f97000[1]] : f176000[0];
            if (var13 != null && m228000(var9, var13)) {
               for (Rec0246 var22 : var13) {
                  this.m190000(var9, var22, var14, var15, var16, var17, var18);
               }
            } else {
               ArrayList var19 = new ArrayList(var1.length());
               boolean var20 = var9.m70000(
                  var1,
                  f176000[1],
                  f106000[0],
                  var5,
                  (Float)this.f46000[f97000[2]],
                  var10,
                  var11,
                  var16,
                  var8x -> {
                     Rec0246 var9x = new Rec0246(
                        var8x.m28000(),
                        var8x.m18000(),
                        var8x.m20000(),
                        var8x.m52000(),
                        var8x.m2000(),
                        var8x.m38000(),
                        var8x.m16000(),
                        var8x.m58000(),
                        var8x.m34000(),
                        var8x.m6000(),
                        var8x.m56000(),
                        var8x.m44000()
                     );
                     var19.add(var9x);
                     this.m190000(var9, var9x, var14, var15, var16, var17, var18);
                  }
               );
               if (var20) {
                  ((LinkedHashMap)this.f22000[f97000[3]]).put(var12, var19);
               }
            }
         }
      }
   }

   private void m190000(ZwBs var1, Rec0246 var2, float var3, float var4, int var5, int var6, float var7) {
      int var8 = var1.m44000(var2.f9000);
      this.m134000();
      if (this.m116000(var8)) {
         this.m134000();
      }

      float var9 = var2.f3000 + var3;
      float var10 = var2.f2000 + var4;
      float var11 = var2.f4000 + var3;
      float var12 = var2.f6000 + var4;
      this.m170000((Matrix3x2f)this.f113000[f97000[4]], var9, var10, var11 - var9, var12 - var10);
      float var13 = var2.f1000 / Math.max(f14000[1], var2.f7000);
      float var14 = var2.f1000 / Math.max(f14000[2], var2.f10000);
      byte var15 = var7 > f106000[1] && this.m132000(var6) ? f129000[6] : f9000[0];
      C0806.m28000(
         (C0830)f41000[f97000[5]],
         (Vector2f)this.f17000[f97000[6]],
         (Vector2f)this.f17000[f145000[0]],
         (Vector2f)this.f17000[f145000[1]],
         (Vector2f)this.f17000[f145000[2]],
         var5,
         var2.f11000,
         var2.f12000,
         var2.f8000,
         var2.f5000,
         var13,
         var14,
         var6,
         var7,
         (Integer)this.f89000[f145000[3]],
         (Integer)this.f89000[f145000[4]],
         (Vector4f)this.f147000[f145000[5]],
         (Vector4f)this.f147000[f100000[0]],
         f129000[7] | var15 | (Integer)this.f46000[f100000[1]] | this.m32000()
      );
   }

   private float m194000(float var1, float var2, float var3) {
      return var3 <= f65000[6] ? var1 : Math.min(var1, Math.min(f65000[7], var2 / var3));
   }

   public void m196000(Iface0215 var1) {
      if ((Integer)this.f109000[f207000[3]] == ((IlmOisOkp[])this.f109000[f207000[4]]).length) {
         IlmOisOkp[] var2 = new IlmOisOkp[((IlmOisOkp[])this.f109000[f207000[5]]).length * f45000[3]];
         System.arraycopy((IlmOisOkp[])this.f109000[f207000[6]], f37000[3], var2, f37000[4], ((IlmOisOkp[])this.f109000[f207000[7]]).length);
         this.f109000[f43000[0]] = var2;
      }

      IlmOisOkp var11 = ((IlmOisOkp[])this.f109000[f43000[1]])[this.f109000[f43000[2]]];
      if (var11 == null) {
         var11 = new IlmOisOkp();
         ((IlmOisOkp[])this.f109000[f43000[3]])[this.f109000[f43000[4]]] = var11;
      }

      var11.f1000[f43000[5]] = var1;
      ((Matrix3x2f)var11.f1000[f43000[6]]).set((Matrix3x2f)this.f113000[f43000[7]]);
      Integer var9 = (Integer)this.f109000[f103000[0]] + f170000[0];
      this.f109000[f103000[1]] = var9;
      Integer var10 = (Integer)this.f162000[f103000[2]] + f170000[1];
      this.f162000[f103000[3]] = var10;
   }

   private boolean m198000(float var1, float var2) {
      return !(var1 <= f19000[2]) && !(var2 <= f19000[3]) ? f114000[1] : f114000[0];
   }

   private void m200000(Rec0120 var1) {
      float var2 = var1.m2000();
      float var3 = var1.m18000();
      if (!this.m198000(var2, var3) && !this.m102000()) {
         int var4 = this.m50000(var1.m24000());
         int var5 = this.m50000(var1.m4000());
         int var6 = this.m50000(var1.m16000());
         byte var7 = f129000[2];
         boolean var8 = this.m132000(var4);
         if (var1.m8000() > f143000[4] && this.m132000(var5)) {
            var7 |= f129000[3];
         }

         if (var1.m14000() > f143000[5]) {
            var7 |= f129000[4];
         }

         if (var8 || (var7 & f129000[5]) != 0) {
            this.m158000(
               (Matrix3x2f)this.f113000[f36000[6]],
               var1.m22000(),
               var1.m20000(),
               var2,
               var3,
               var1.m12000(),
               var4,
               var1.m8000(),
               var5,
               var6,
               var1.m14000(),
               var7
            );
         }
      }
   }

   private void m202000(
      Matrix3x2f var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      float var12,
      float var13
   ) {
      this.m134000();
      if (this.m116000(var11)) {
         this.m134000();
      }

      this.m170000(var1, var2, var3, var4, var5);
      C0806.m28000(
         (C0830)f41000[f137000[1]],
         (Vector2f)this.f17000[f137000[2]],
         (Vector2f)this.f17000[f137000[3]],
         (Vector2f)this.f17000[f137000[4]],
         (Vector2f)this.f17000[f35000[0]],
         var10,
         var6,
         var7,
         var8,
         var9,
         var12,
         var13,
         f9000[4],
         f69000[1],
         (Integer)this.f89000[f35000[1]],
         (Integer)this.f89000[f35000[2]],
         (Vector4f)this.f147000[f35000[3]],
         (Vector4f)this.f147000[f35000[4]],
         f80000[1] | (Integer)this.f46000[f119000[0]] | this.m32000()
      );
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void m206000(NNBK var1, C0346 var2, float var3, Iface0006 var4) {
      this.f77000[f73000[3]] = var4;
      boolean var14 = false /* VF: Semaphore variable */;

      try {
         var14 = true;
         if (var4 != null) {
            var4.m12000(f167000[1]);
            GL11.glColorMask(f187000[0], f187000[1], f187000[2], f187000[3]);
            GL11.glClearColor(f59000[4], f59000[5], f59000[6], f16000[0]);
            var4.m16000(f187000[4], f187000[5]);
         }

         this.m144000(var1, var2, var3);
         var14 = false;
      } finally {
         if (var14) {
            Object var12 = null;
            this.f77000[f73000[5]] = var12;
         }
      }

      Object var11 = null;
      this.f77000[f73000[4]] = var11;
   }

   public void m208000(Iface0214 var1) {
      switch (var1) {
         case Rec0115 var4:
            this.m184000(var4);
            break;
         case Rec0114 var5:
            this.m182000(var5);
            break;
         case Rec0121 var6:
            this.m164000(var6);
            break;
         case Rec0120 var7:
            this.m200000(var7);
            break;
         case Rec0116 var8:
            this.m226000(var8);
            break;
         case Rec0110 var9:
            this.m162000(var9);
            break;
         default:
            throw new MatchException(null, null);
      }
   }

   private void m210000(Iface0003 var1, float var2, float var3, float var4, float var5, float var6, Matrix4f var7) {
      if (var1 != null) {
         int var8 = Math.round(Math.clamp(var2, f168000[1], f143000[0]) * f143000[1]);
         if (var8 > 0) {
            int var9 = var8 << f45000[4] | var8 << f45000[5] | var8 << f129000[0] | var8;
            ow var10 = ((NNuU)this.f113000[f205000[2]]).Nt();
            int var11 = Math.max(f164000[3], var10.U());
            int var12 = Math.max(f94000[0], var10.E());
            C0806.m32000((C0830)f41000[f205000[3]], f143000[2], f143000[3], var11, var12, var3, var4, var5, var6, var9);
            ((C0805)f53000[f180000[0]]).m32000(var2x -> {
               var2x.m66000(f50000[3]).m18000(IlkOns.m10000());
               var2x.m66000(f50000[4]).m18000(var7);
               var2x.m10000(f192000[0]).m6000(var1);
            });
            this.m98000(f206000[0]);
         }
      }
   }

   private Iface0003 m216000(int var1, int var2, int var3, int var4, int var5) {
      this.m240000();

      Iface0003 var6;
      try {
         var6 = (Iface0006)this.f77000[f122000[2]] != null
            ? ((rw.core.C0014)this.f22000[f165000[0]]).m68000(((Iface0006)this.f77000[f165000[1]]).m14000(), var1, var2, var3, var4, var5)
            : ((rw.core.C0014)this.f22000[f165000[2]]).m66000(var1, var2, var3, var4, var5);
      } finally {
         this.m40000();
      }

      return var6;
   }

   public void m218000(TextRenderable$Styled var1) {
      if ((Integer)this.f77000[f149000[0]] != 0) {
         this.m38000(f194000[2]);
         C1120[] var10000 = (C1120[])this.f77000[f149000[1]];
         int var10003 = (Integer)this.f77000[f149000[2]] - f142000[4];
         Integer var13 = var10003;
         this.f77000[f28000[0]] = var13;
         C1120 var2 = var10000[var10003];
         Iface0003 var3 = ((Iface0006)var2.f1000[f28000[1]]).m14000();
         Iface0006 var14 = (Iface0006)var2.f1000[f28000[2]];
         this.f77000[f28000[3]] = var14;
         Float var15 = (Float)var2.f1000[f28000[4]];
         this.f52000[f200000[0]] = var15;
         this.m72000();
         this.m40000();
         switch (var1) {
            case Rec0122 var6:
               this.m156000(var3, var6.m4000() * (Float)this.f52000[f200000[1]]);
               break;
            case Rec0109 var7:
               this.m160000(var3, var7, (Float)this.f52000[f200000[2]]);
               break;
            case Rec0113 var8:
               this.m230000(var3, var8, (Float)this.f52000[f200000[3]]);
               break;
            default:
               throw new MatchException(null, null);
         }
      }
   }

   public void m220000(float var1) {
      if ((Integer)this.f52000[f74000[6]] == ((float[])this.f166000[f74000[7]]).length) {
         float[] var6 = Arrays.copyOf((float[])this.f166000[f191000[0]], ((float[])this.f166000[f191000[1]]).length * f45000[2]);
         this.f166000[f191000[2]] = var6;
      }

      float[] var10000 = (float[])this.f166000[f191000[3]];
      int var10003 = (Integer)this.f52000[f191000[4]];
      Integer var7 = var10003 + f37000[1];
      this.f52000[f191000[5]] = var7;
      var10000[var10003] = (Float)this.f52000[f191000[6]];
      Float var8 = (Float)this.f52000[f198000[0]] * Math.clamp(var1, f189000[2], f56000[0]);
      this.f52000[f198000[1]] = var8;
   }

   public void m222000(boolean var1) {
      Boolean var6 = var1;
      this.f46000[f73000[1]] = var6;
   }

   private void m224000(OlpOtr var1, List<Vector4f> var2, List<Vector4f> var3) {
      if ((OlpOtr)this.f7000[f175000[1]] != var1) {
         this.f7000[f175000[2]] = var1;
         C1250[] var15 = new C1250[f62000[6]];
         this.f7000[f175000[3]] = var15;
         C1250[] var16 = new C1250[f62000[7]];
         this.f7000[f175000[4]] = var16;
      }

      int var4 = var2.size();

      for (int var5 = f161000[0]; var5 < var4; var5++) {
         C1250 var6 = ((C1250[])this.f7000[f105000[0]])[var5];
         if (var6 == null) {
            var6 = var1.m94000("u_clip_rects[" + var5 + "]");
            ((C1250[])this.f7000[f105000[1]])[var5] = var6;
         }

         C1250 var7 = ((C1250[])this.f7000[f105000[2]])[var5];
         if (var7 == null) {
            var7 = var1.m94000("u_clip_rounds[" + var5 + "]");
            ((C1250[])this.f7000[f105000[3]])[var5] = var7;
         }

         Vector4f var8 = (Vector4f)var2.get(var5);
         Vector4f var9 = (Vector4f)var3.get(var5);
         var6.m18000(var8.x(), var8.y(), var8.z(), var8.w());
         var7.m18000(var9.x(), var9.y(), var9.z(), var9.w());
      }
   }

   private void m226000(Rec0116 var1) {
      float var2 = var1.m2000();
      float var3 = var1.m10000();
      if (!this.m198000(var2, var3) && !this.m102000() && !(var1.m8000() <= f56000[7]) && this.m132000(var1.m16000())) {
         Rec0236 var4 = this.m174000(var1.m14000(), var1.m12000(), var2, var3, (Matrix3x2f)this.f113000[f159000[7]]);
         float var5 = var4.m8000();
         float var6 = var4.m20000();
         if (!this.m198000(var5, var6)) {
            int var7 = (int)Math.floor(var4.m2000());
            int var8 = (int)Math.floor(var4.m10000());
            int var9 = (int)Math.ceil(var4.m12000());
            int var10 = (int)Math.ceil(var4.m14000());
            int var11 = var9 - var7;
            int var12 = var10 - var8;
            if (var11 > 0 && var12 > 0) {
               float var13 = var2 <= f160000[0] ? f160000[1] : var5 / var2;
               float var14 = var3 <= f160000[2] ? f160000[3] : var6 / var3;
               int var15 = Math.max(f83000[0], Math.round(var1.m8000() * Math.min(var13, var14)));
               if (!(Boolean)this.f46000[f84000[0]]) {
                  this.m148000(var1.m4000(), var5, var6, Math.min(var13, var14), (Vector4f)this.f17000[f84000[3]]);
                  this.m236000((C1128)this.f86000[f88000[0]], (C1128)this.f86000[f88000[1]]);
                  this.m38000(f134000[1]);
                  Iface0003 var16 = this.m216000(var7, var8, var11, var12, var15);
                  if (var16 != null) {
                     float var17 = ((rw.core.C0014)this.f22000[f88000[2]]).m74000();
                     float var18 = ((rw.core.C0014)this.f22000[f88000[3]]).m6000();
                     float var19 = ((rw.core.C0014)this.f22000[f88000[4]]).m44000();
                     float var20 = ((rw.core.C0014)this.f22000[f88000[5]]).m50000();
                     C0806.m32000((C0830)f41000[f125000[0]], var7, var8, var11, var12, var17, f1000[0] - var20, var18, f1000[1] - var19, var1.m16000());
                     boolean var21 = ((C1128)this.f86000[f125000[1]]).m6000() > f190000[1] ? f190000[2] : f190000[3];
                     C0805 var22 = var21 ? (C0805)f53000[f125000[2]] : (C0805)f53000[f125000[3]];
                     var22.m32000(
                        var6x -> {
                           var6x.m66000(f192000[1]).m18000(IlkOns.m10000());
                           var6x.m66000(f192000[2]).m18000(RenderSystem.getModelViewMatrix());
                           var6x.m10000(f192000[3]).m6000(var16);
                           var6x.m106000(f192000[4]).m18000(var5, var6);
                           var6x.m94000(f192000[5])
                              .m18000(
                                 ((Vector4f)this.f17000[f79000[0]]).z(),
                                 ((Vector4f)this.f17000[f79000[1]]).w(),
                                 ((Vector4f)this.f17000[f79000[2]]).y(),
                                 ((Vector4f)this.f17000[f79000[3]]).x()
                              );
                           var6x.m106000(f192000[6]).m18000(var4.m2000(), var4.m10000());
                           this.m168000(var6x, (C1128)this.f86000[f48000[0]], (C1128)this.f86000[f48000[1]], var21);
                        }
                     );
                     this.m98000(f134000[2]);
                  }
               } else if (this.m104000(var15) != null) {
                  this.m158000(
                     (Matrix3x2f)this.f113000[f84000[1]],
                     var1.m14000(),
                     var1.m12000(),
                     var2,
                     var3,
                     var1.m4000(),
                     var1.m16000(),
                     f160000[4],
                     f83000[1],
                     f190000[0],
                     f160000[5],
                     f84000[2]
                  );
               }
            }
         }
      }
   }

   private static boolean m228000(ZwBs var0, List<Rec0246> var1) {
      for (Rec0246 var3 : var1) {
         if (var0.m2000(var3.f9000) != var3.f7000 || var0.m108000(var3.f9000) != var3.f10000) {
            return f193000[7];
         }
      }

      return f14000[0];
   }

   private void m230000(Iface0003 var1, Rec0113 var2, float var3) {
      ((Vector2f)this.f17000[f64000[1]]).set(var2.m10000(), var2.m2000());
      ((Matrix3x2f)this.f113000[f64000[2]]).transformPosition((Vector2f)this.f17000[f64000[3]]);
      ((Matrix4f)this.f113000[f64000[4]])
         .set(RenderSystem.getModelViewMatrix())
         .translate(((Vector2f)this.f17000[f64000[5]]).x, ((Vector2f)this.f17000[f64000[6]]).y, f163000[0])
         .rotateZ((float)Math.toRadians(var2.m6000()))
         .scale(var2.m8000(), var2.m8000(), f163000[1])
         .translate(-((Vector2f)this.f17000[f64000[7]]).x, -((Vector2f)this.f17000[f205000[0]]).y, f49000[0]);
      this.m210000(var1, var3, f49000[1], f49000[2], f49000[3], f168000[0], (Matrix4f)this.f113000[f205000[1]]);
   }

   private Iface0003 m232000(Iface0003 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.m240000();

      Iface0003 var9;
      try {
         var9 = ((rw.core.C0014)this.f22000[f165000[3]]).m60000(var1, var2, var3, var4, var5, var6, var7, var8);
      } finally {
         this.m40000();
      }

      return var9;
   }

   private void m236000(C1128 var1, C1128 var2) {
      var1.m10000();
      var2.m10000();

      for (int var3 = f102000[1]; var3 < this.f109000[f99000[1]]; var3++) {
         IlmOisOkp var4 = ((IlmOisOkp[])this.f109000[f66000[0]])[var3];
         if (this.m238000(
            (Iface0215)var4.f1000[f66000[1]], (Matrix3x2f)var4.f1000[f66000[2]], (Vector4f)this.f17000[f66000[3]], (Vector4f)this.f17000[f66000[4]]
         )) {
            var1.m26000((Vector4f)this.f17000[f66000[5]]);
            var2.m26000((Vector4f)this.f17000[f66000[6]]);
         }
      }
   }

   private boolean m238000(Iface0215 var1, Matrix3x2f var2, Vector4f var3, Vector4f var4) {
      if (var1 instanceof Rec0111 var10) {
         Rec0111 var10000 = var10;

         try {
            var27 = var10000.m12000();
         } catch (Throwable var20) {
            throw new MatchException(var20.toString(), var20);
         }

         float var11 = var27;
         var10000 = var10;

         try {
            var29 = var10000.m10000();
         } catch (Throwable var19) {
            throw new MatchException(var19.toString(), var19);
         }

         var11 = var29;
         var10000 = var10;

         try {
            var31 = var10000.m2000();
         } catch (Throwable var18) {
            throw new MatchException(var18.toString(), var18);
         }

         var11 = var31;
         var10000 = var10;

         try {
            var33 = var10000.m8000();
         } catch (Throwable var17) {
            throw new MatchException(var17.toString(), var17);
         }

         var11 = var33;
         var10000 = var10;

         try {
            var35 = var10000.m6000();
         } catch (Throwable var16) {
            throw new MatchException(var16.toString(), var16);
         }

         Vector4fc var25 = var35;
         Rec0236 var21 = this.m174000(var11, var11, var11, var11, var2);
         var11 = var21.m8000();
         float var12 = var21.m20000();
         if (!(var11 <= f54000[0]) && !(var12 <= f54000[1])) {
            float var13 = var11 <= f54000[2] ? f54000[3] : var11 / var11;
            float var14 = var11 <= f54000[4] ? f65000[0] : var12 / var11;
            this.m148000(var25, var11, var12, Math.min(var13, var14), var4);
            var3.set(var21.m2000(), var21.m10000(), var11, var12);
            return f181000[1];
         } else {
            return f181000[0];
         }
      } else {
         return f161000[6];
      }
   }

   private void m240000() {
      if (!((Deque)this.f113000[f199000[2]]).isEmpty()) {
         GL11.glDisable(f199000[3]);
      }
   }

   private void m242000(String var1) {
      if (((C0830)f41000[f135000[0]]).m6000().m16000() == 0) {
         ((C1128)this.f147000[f135000[1]]).m10000();
         ((C1128)this.f147000[f135000[2]]).m10000();
         Integer var7 = Integer.valueOf(f80000[4]);
         this.f162000[f135000[3]] = var7;
      } else {
         C0805 var2 = this.f46000[f135000[4]]
            ? (this.f46000[f135000[5]] ? (C0805)f53000[f27000[0]] : (C0805)f41000[f27000[1]])
            : (this.f46000[f27000[2]] ? (C0805)f41000[f27000[3]] : (C0805)f41000[f27000[4]]);
         var2.m24000(var1x -> {
            var1x.m66000(f50000[2]).m18000(IlkOns.m10000());
            this.m166000(var1x, (int[])this.f86000[f199000[5]], this.m44000());
            if ((Boolean)this.f46000[f199000[6]]) {
               this.m126000(var1x);
            }

            if ((Boolean)this.f46000[f199000[7]]) {
               this.m224000(var1x, (C1128)this.f147000[f197000[0]], (C1128)this.f147000[f197000[1]]);
            }
         });
         this.m98000(var1);
         ((C1128)this.f147000[f27000[5]]).m10000();
         ((C1128)this.f147000[f140000[0]]).m10000();
         Integer var8 = Integer.valueOf(f80000[5]);
         this.f162000[f140000[1]] = var8;
      }
   }

   private Iface0006 m246000(int var1) {
      while (((List)this.f77000[f51000[0]]).size() <= var1) {
         ((List)this.f77000[f51000[1]]).add(KrHa.m18000(() -> ((NNuU)this.f113000[f197000[3]]).e().N, () -> ((NNuU)this.f113000[f197000[2]]).e().y));
      }

      return ((rw.core.C0013)rw.core.C0013.f2000[f51000[2]]).m8000((C0012)((List)this.f77000[f51000[3]]).get(var1));
   }

   public void m248000() {
      this.m108000();
   }

   private static void m254000() {
      f59000 = new float[]{0.75F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F};
      f16000 = new float[]{0.0F, 1.0F, 1.0F, 1.0F};
      f24000 = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F};
      f189000 = new float[]{1.0F, 0.0F, 0.0F};
      f56000 = new float[]{1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0E-4F};
      f160000 = new float[]{1.0E-4F, 1.0F, 1.0E-4F, 1.0F, 0.0F, 0.0F};
      f1000 = new float[]{1.0F, 1.0F, 0.0F};
      f42000 = new float[]{1.0F, 1.0F, 0.0F};
      f163000 = new float[]{0.0F, 1.0F};
      f49000 = new float[]{0.0F, 0.0F, 1.0F, 1.0F};
      f168000 = new float[]{0.0F, 0.0F};
      f143000 = new float[]{1.0F, 255.0F, 0.0F, 0.0F, 1.0E-4F, 1.0E-4F, 1.0E-4F, 1.0F};
      f177000 = new float[]{1.0E-4F, 0.5F, 0.5F, 1.0F, 0.0F, 0.0F};
      f176000 = new float[]{0.0F, 0.0F};
      f106000 = new float[]{0.0F, 0.0F, 1.0E-4F, 1.0E-4F, 1.0E-4F, 1.0F, 1.0E-4F, 1.0F};
      f124000 = new float[]{0.0F, 0.0F};
      f63000 = new float[]{0.0F, 0.85F};
      f10000 = new float[]{0.0F, 1.0E-4F};
      f154000 = new float[]{1.0E-4F, 0.0F, 0.0F, 0.0F};
      f69000 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
      f54000 = new float[]{1.0E-4F, 1.0E-4F, 1.0E-4F, 1.0F, 1.0E-4F};
      f65000 = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0E-4F, 1.0F};
      f19000 = new float[]{0.0F, 1.0F, 1.0E-4F, 1.0E-4F};
      f98000 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 1.0E-4F, 0.85F};
   }

   private void m256000() {
      if (this.f113000 == null) {
         this.f113000 = new Object[f209000[1]];
         Object[] var1 = this.f113000;
      }

      if (this.f17000 == null) {
         this.f17000 = new Object[f209000[2]];
         Object[] var2 = this.f17000;
      }

      if (this.f147000 == null) {
         this.f147000 = new Object[f58000[0]];
         Object[] var3 = this.f147000;
      }

      if (this.f86000 == null) {
         this.f86000 = new Object[f58000[1]];
         Object[] var4 = this.f86000;
      }

      if (this.f22000 == null) {
         this.f22000 = new Object[f29000[0]];
         Object[] var5 = this.f22000;
      }

      if (this.f7000 == null) {
         this.f7000 = new Object[f29000[1]];
         Object[] var6 = this.f7000;
      }

      if (this.f162000 == null) {
         this.f162000 = new Object[f29000[2]];
         Object[] var7 = this.f162000;
         var7[f29000[3]] = Integer.valueOf(f3000[0]);
         var7[f29000[4]] = Integer.valueOf(f3000[1]);
         var7[f29000[5]] = Integer.valueOf(f3000[2]);
         var7[f29000[6]] = Integer.valueOf(f3000[3]);
      }

      if (this.f109000 == null) {
         this.f109000 = new Object[f78000[0]];
         Object[] var8 = this.f109000;
         var8[f3000[4]] = Integer.valueOf(f3000[5]);
         var8[f40000[0]] = Integer.valueOf(f40000[1]);
      }

      if (this.f166000 == null) {
         this.f166000 = new Object[f78000[1]];
         Object[] var9 = this.f166000;
         var9[f40000[2]] = Integer.valueOf(f40000[3]);
      }

      if (this.f52000 == null) {
         this.f52000 = new Object[f55000[0]];
         Object[] var10 = this.f52000;
         var10[f31000[0]] = Integer.valueOf(f31000[1]);
         var10[f31000[2]] = f98000[0];
      }

      if (this.f89000 == null) {
         this.f89000 = new Object[f55000[1]];
         Object[] var11 = this.f89000;
         var11[f31000[3]] = Integer.valueOf(f92000[0]);
         var11[f92000[1]] = Integer.valueOf(f92000[2]);
         var11[f55000[2]] = Integer.valueOf(f92000[3]);
      }

      if (this.f46000 == null) {
         this.f46000 = new Object[f55000[3]];
         Object[] var12 = this.f46000;
         var12[f92000[4]] = Integer.valueOf(f92000[5]);
         var12[f23000[0]] = f23000[1];
         var12[f174000[0]] = f72000[0];
         var12[f174000[1]] = f72000[1];
         var12[f174000[2]] = f98000[1];
         var12[f174000[3]] = Integer.valueOf(f72000[2]);
         var12[f204000[0]] = Integer.valueOf(f72000[3]);
      }

      if (this.f33000 == null) {
         this.f33000 = new Object[f204000[1]];
         Object[] var13 = this.f33000;
         var13[f72000[4]] = f98000[2];
         var13[f72000[5]] = f98000[3];
      }

      if (this.f77000 == null) {
         this.f77000 = new Object[f204000[2]];
         Object[] var14 = this.f77000;
         var14[f204000[3]] = Integer.valueOf(f72000[6]);
         var14[f204000[4]] = Integer.valueOf(f173000[0]);
      }
   }

   private void m262000() {
      Integer var5 = Integer.valueOf(f193000[1]);
      this.f77000[f36000[4]] = var5;
      Object var6 = null;
      this.f77000[f36000[5]] = var6;
   }
}

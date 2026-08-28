package net.minecraft.gametest.framework;

import KDFzREm.NDg;
import KDFzREm.NDq;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNUB;
import KDFzREm.NNUU;
import KDFzREm.NNUW;
import KDFzREm.NNWE;
import KDFzREm.NNcO;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NbX;
import KDFzREm.NcT;
import KDFzREm.TP;
import com.mojang.authlib.GameProfile;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.api.Iface0670;
import rw.core.C0745;
import rw.core.C0916;
import rw.core.C0991;
import rw.core.C1183;
import rw.defs.Enum0055;
import rw.gui.Enum0070;
import rw.module.AttackAura_x;
import rw.module.Blink;
import rw.setting.C0071;
import rw.setting.C0122;

@AnnotationDefault(
   L = "FakePlayer",
   y = Enum0055.VISUAL,
   N = Enum0070.WORLD
)
public class GameTestHelper extends GuiWidget {
   private static boolean[] i;
   private static short[] R;
   private static double[] M;
   private static short[] B;
   public static Object[] L;
   private static short[] Z;
   private static short[] z;
   private static short[] U;
   private static short[] W;
   private static short[] m;
   private static short[] P;
   private static short[] s;
   private static short[] T;
   private static byte[] b;
   private static double[] j;
   private static boolean[] v;
   private static short[] n;
   private static short[] t;
   private static short[] G;
   private static byte[] l;
   private static short[] d;
   private static short[] w;
   private static String[] k;
   private static short[] Y;
   private static float[] Q;
   private static String[] O;
   private static float[] g;
   public Object[] u;
   private static short[] I;
   private static byte[] J;
   private static short[] o;
   private static String[] q;
   private static int[] K;
   private static short[] V;
   private static short[] e;
   private static short[] H;
   private static short[] c;
   private static short[] X;
   private static byte[] a;
   private static byte[] p;

   private static void P() {
      Q = new float[]{0.5F, 0.9F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.1F};
      g = new float[]{2.0F, 0.0F, 90.0F, 0.0F, 0.0F, 2.0F, 0.1F};
   }

   private static void T() {
      L = new Object[]{null, 2.0F, 0.1F, 3};
   }

   private void Q() {
      llsissm<"tqfeaad",-1103481163,711782473,711782492,711782495,303578245,700224607>(this);
      ThreadLocalRandom var1 = ThreadLocalRandom.current();
      String var2 = ((String[])TP.L[TP.V[4]])[var1.nextInt(((String[])TP.L[TP.R[0]]).length)] + var1.nextInt(TP.l[0], TP.l[1]);
      C0071 var3 = new C0071(
         (NNNZg)((NNuU)llsissm<"hatwg",-1103481161,711782473,711782472,711782475,1037573150,1106765111>(this)[TP.R[1]]).T[TP.R[2]],
         new GameProfile(UUID.randomUUID(), var2)
      );
      var3.method_5838(-var1.nextInt(TP.K[0], TP.K[1]));
      NXi var9 = ((NNNwS)((NNuU)llsissm<"ktozn",-1103481161,711782473,711782472,711782475,2040980701,-1979367452>(this)[TP.R[3]]).T[TP.c[0]]).method_73189();
      llsissm<"mefxr",-1103481161,711782473,711782494,711782475,78270204,-1296625436>(this)[TP.c[1]] = var9;
      Float var10 = ((NNNwS)((NNuU)llsissm<"tqfeaad",-1103481161,711782473,711782472,711782475,1770357441,-1113392587>(this)[TP.I[0]]).T[TP.I[1]])
         .method_36454();
      llsissm<"rims",-1103481161,711782473,711782494,711782475,1187905328,998036104>(this)[TP.I[2]] = var10;
      float var4 = C1183.m40000((Float)llsissm<"myhfj",-1103481161,711782473,711782494,711782475,-1069350352,-795123403>(this)[TP.I[3]]);
      NXi var11 = new NXi(-NNWE.P(var4), TP.M[3], -NNWE.m(var4));
      llsissm<"xlwleny",-1103481161,711782473,711782494,711782475,-1662155586,-1019328434>(this)[TP.I[4]] = var11;
      Float var12 = TP.Q[4];
      llsissm<"ayzzvx",-1103481161,711782473,711782494,711782475,-1513251062,1584016915>(this)[TP.I[5]] = var12;
      var3.method_5808(
         ((NXi)llsissm<"psgrycfe",-1103481161,711782473,711782494,711782475,1959120920,-1213384766>(this)[TP.I[6]]).M,
         ((NXi)llsissm<"xlwleny",-1103481161,711782473,711782494,711782475,1624385890,1200931316>(this)[TP.I[7]]).B,
         ((NXi)llsissm<"mefxr",-1103481161,711782473,711782494,711782475,783328889,-31635497>(this)[TP.e[0]]).Z,
         (Float)llsissm<"tqfeaad",-1103481161,711782473,711782494,711782475,-262994254,-1559191691>(this)[TP.e[1]],
         TP.Q[5]
      );
      var3.method_5847((Float)llsissm<"hatwg",-1103481161,711782473,711782494,711782475,1970860342,1544205350>(this)[TP.X[0]]);
      var3.method_5636((Float)llsissm<"hatwg",-1103481161,711782473,711782494,711782475,1641405167,-1563745071>(this)[TP.X[1]]);
      ((NNNZg)((NNuU)llsissm<"mefxr",-1103481161,711782473,711782472,711782475,1416856523,487573575>(this)[TP.X[2]]).T[TP.X[3]]).u(var3);
      llsissm<"hatwg",-1103481161,711782473,711782494,711782475,827709395,432680073>(this)[TP.X[4]] = var3;
   }

   public GameTestHelper() {
      llsissm<"thuxcw",-1103481163,711782473,711782492,711782495,-1103481163,-1103481163>(this);
      C0991 var5 = C0122.m26000(this, TP.q[0], TP.v[0]);
      llsissm<"ayzzvx",-1103481161,711782473,711782494,711782475,-1103481161,-1103481161>(this)[TP.z[0]] = var5;
      C0991 var6 = C0122.m26000(this, TP.q[1], TP.v[1]);
      llsissm<"myhfj",-1103481161,711782473,711782494,711782475,-1103481161,-1103481161>(this)[TP.z[1]] = var6;
      C0745 var7 = new C0745(this);
      llsissm<"szoygpg",-1103481161,711782473,711782494,711782475,-1103481161,-1103481161>(this)[TP.z[2]] = var7;
      NXi var8 = NXi.L;
      llsissm<"psgrycfe",-1103481161,711782473,711782494,711782475,-1103481161,-1103481161>(this)[TP.z[3]] = var8;
      NXi var9 = NXi.L;
      llsissm<"thuxcw",-1103481161,711782473,711782494,711782475,-1103481161,-1103481161>(this)[TP.z[4]] = var9;
   }

   static {
      ntfClinit();
   }

   public boolean i() {
      llsissm<"xlwleny",-1103481163,711782473,711782481,711782495,303578245,700224607>(this);
      return super.m14000();
   }

   private static void b() {
      v = new boolean[]{true, true, true, false, true};
      i = new boolean[]{false, true, false, false, true, false, true};
   }

   private static void s() {
      l = new byte[]{10, 100, 3, 15};
      J = new byte[]{2, 3};
      b = new byte[]{4, 5, 6, 7, 8, 9, 10};
      p = new byte[]{11, 12, 13, 14};
      a = new byte[]{8, 6, 7, 4, 2, 3, 3};
   }

   private static void n() {
      j = new double[]{0.0, 0.5, 0.5};
      M = new double[]{0.1, 0.0, 0.1, 0.0, 1.0, -1.0};
   }

   private void l() {
      llsissm<"mefxr",-1103481163,711782473,711782492,711782495,303578245,700224607>(this);
      double var1 = ((NNNwS)((NNuU)llsissm<"rims",-1103481161,711782473,711782472,711782475,1648288621,-372830477>(this)[TP.P[7]]).T[TP.t[0]])
         .method_45325(NNcO.u);
      int var3 = Math.max(TP.i[1], (int)(var1 * TP.j[1]));

      for (int var4 = TP.i[2]; var4 < var3; var4++) {
         ((NNNZg)((NNuU)llsissm<"mefxr",-1103481161,711782473,711782472,711782475,-1567891731,289937832>(this)[TP.t[1]]).T[TP.t[2]])
            .method_8406(
               NcT.B,
               ((C0071)llsissm<"tqfeaad",-1103481161,711782473,711782494,711782475,-910072934,196980614>(this)[TP.t[3]]).method_23317(),
               ((C0071)llsissm<"rims",-1103481161,711782473,711782494,711782475,-1266499274,1317655811>(this)[TP.t[4]]).method_23323(TP.j[2]),
               ((C0071)llsissm<"ktozn",-1103481161,711782473,711782494,711782475,-427892833,646741878>(this)[TP.t[5]]).method_23321(),
               ((NNNZg)((NNuU)llsissm<"myhfj",-1103481161,711782473,711782472,711782475,-628816399,789533862>(this)[TP.V[0]]).T[TP.V[1]]).field_9229.E()
                  * TP.M[0],
               TP.M[1],
               ((NNNZg)((NNuU)llsissm<"thuxcw",-1103481161,711782473,711782472,711782475,852785542,703369548>(this)[TP.V[2]]).T[TP.V[3]]).field_9229.E()
                  * TP.M[2]
            );
      }
   }

   private void d() {
      llsissm<"hatwg",-1103481163,711782473,711782492,711782495,303578245,700224607>(this);
      if ((C0071)llsissm<"szoygpg",-1103481161,711782473,711782494,711782475,-1023731631,-680841266>(this)[TP.X[5]] != null) {
         if (((C0071)llsissm<"hatwg",-1103481161,711782473,711782494,711782475,2106751599,1741346918>(this)[TP.w[0]]).method_73183() instanceof NNNZg var1) {
            var1.N(((C0071)llsissm<"ayzzvx",-1103481161,711782473,711782494,711782475,1629849390,1066938137>(this)[TP.w[1]]).method_5628(), NbX.field_26999);
         }

         Object var7 = null;
         llsissm<"mefxr",-1103481161,711782473,711782494,711782475,188710023,-1162459054>(this)[TP.w[2]] = var7;
      }
   }

   private static void m() {
      q = new String[]{"walk", "rotate", "Steve"};
      O = new String[]{"Alex", "Herobrine", "Nagibator", "Vitalik", "Sanya", "Dimon", "Leha", "KolyaPRO"};
      k = new String[]{"Artem", "Nikita", "Timoha", "Zhenya", "MaksFX", "Vladik"};
   }

   private void k() {
      llsissm<"thuxcw",-1103481163,711782473,711782492,711782495,303578245,700224607>(this);
      NXi var1 = (NXi)llsissm<"myhfj",-1103481161,711782473,711782494,711782475,794990126,1568523847>(this)[TP.w[3]];
      float var2 = (Float)llsissm<"hatwg",-1103481161,711782473,711782494,711782475,-469134119,826556907>(this)[TP.w[4]];
      float var3 = TP.Q[6];
      if ((Boolean)((C0991)llsissm<"myhfj",-1103481161,711782473,711782494,711782475,833164167,1188934112>(this)[TP.W[0]]).i()) {
         Float var14 = (Float)llsissm<"tqfeaad",-1103481161,711782473,711782494,711782475,2083415059,-1392101427>(this)[TP.W[1]] + TP.Q[7];
         llsissm<"hatwg",-1103481161,711782473,711782494,711782475,1463152287,-432362173>(this)[TP.W[2]] = var14;
         var1 = ((NXi)llsissm<"hatwg",-1103481161,711782473,711782494,711782475,851993027,-160663874>(this)[TP.W[3]])
            .i(
               ((NXi)llsissm<"rims",-1103481161,711782473,711782494,711782475,238128386,-1294477393>(this)[TP.W[4]])
                  .L(NNWE.m(((Float)llsissm<"myhfj",-1103481161,711782473,711782494,711782475,-120808648,-1067777655>(this)[TP.W[5]]).floatValue()) * TP.g[0])
            );
         double var4 = NNWE.P(((Float)llsissm<"rims",-1103481161,711782473,711782494,711782475,2034766271,855113384>(this)[TP.W[6]]).floatValue()) >= TP.g[1]
            ? TP.M[4]
            : TP.M[5];
         NXi var6 = ((NXi)llsissm<"tqfeaad",-1103481161,711782473,711782494,711782475,-1922652879,1486284625>(this)[TP.W[7]]).L(var4);
         var2 = C1183.m22000(NNWE.u(-var6.M, var6.Z));
      }

      if ((Boolean)((C0991)llsissm<"thuxcw",-1103481161,711782473,711782494,711782475,186977801,471047493>(this)[TP.s[0]]).i()) {
         double var15 = ((NNNwS)((NNuU)llsissm<"szoygpg",-1103481161,711782473,711782472,711782475,-2106234989,872566135>(this)[TP.s[1]]).T[TP.B[0]])
               .method_23317()
            - ((C0071)llsissm<"rims",-1103481161,711782473,711782494,711782475,1610248445,-422834302>(this)[TP.B[1]]).method_23317();
         double var16 = ((NNNwS)((NNuU)llsissm<"xlwleny",-1103481161,711782473,711782472,711782475,-969995134,1730678510>(this)[TP.B[2]]).T[TP.B[3]])
               .method_23320()
            - ((C0071)llsissm<"ktozn",-1103481161,711782473,711782494,711782475,-82873310,745088840>(this)[TP.B[4]]).method_23320();
         double var8 = ((NNNwS)((NNuU)llsissm<"szoygpg",-1103481161,711782473,711782472,711782475,-158268236,-464435057>(this)[TP.B[5]]).T[TP.G[0]])
               .method_23321()
            - ((C0071)llsissm<"rims",-1103481161,711782473,711782494,711782475,-1879587064,-559082301>(this)[TP.G[1]]).method_23321();
         var2 = C1183.m22000(NNWE.u(var8, var15)) - TP.g[2];
         var3 = -C1183.m22000(NNWE.u(var16, Math.hypot(var15, var8)));
      }

      ((C0071)llsissm<"mefxr",-1103481161,711782473,711782494,711782475,-1935491306,-1249921298>(this)[TP.G[2]]).method_66233().method_66267(var1, var2, var3);
      ((C0071)llsissm<"hatwg",-1103481161,711782473,711782494,711782475,-693299260,-226966636>(this)[TP.G[3]]).method_5683(var2, TP.l[2]);
   }

   void t() {
      llsissm<"thuxcw",-1103481163,711782473,711782492,711782495,303578245,700224607>(this);
      if ((C0071)llsissm<"psgrycfe",-1103481161,711782473,711782494,711782475,1351002986,158179495>(this)[TP.U[3]] != null
         && (NNNwS)((NNuU)llsissm<"mefxr",-1103481161,711782473,711782472,711782475,112075816,-367063607>(this)[TP.U[4]]).T[TP.U[5]] != null) {
         ((C0071)llsissm<"szoygpg",-1103481161,711782473,711782494,711782475,-2073187021,17113586>(this)[TP.U[6]])
            .method_48922(
               ((C0071)llsissm<"ayzzvx",-1103481161,711782473,711782494,711782475,-1912672794,928427083>(this)[TP.o[0]])
                  .method_48923()
                  .N((NNNwS)((NNuU)llsissm<"myhfj",-1103481161,711782473,711782472,711782475,-1945424898,-677556464>(this)[TP.o[1]]).T[TP.o[2]])
            );
         llsissm<"hatwg",-1103481163,711782473,711782512,711782495,303578245,700224607>(this);
         boolean var1 = ((NNNwS)((NNuU)llsissm<"thuxcw",-1103481161,711782473,711782472,711782475,-1216968897,-3994181>(this)[TP.T[0]]).T[TP.T[1]])
                  .method_7261(TP.Q[0])
               > TP.Q[1]
            ? TP.v[2]
            : TP.v[3];
         if (var1
            && ((NNNwS)((NNuU)llsissm<"tqfeaad",-1103481161,711782473,711782472,711782475,-1742674037,-138672110>(this)[TP.T[2]]).T[TP.T[3]]).method_5624()) {
            llsissm<"psgrycfe",-1103481163,711782473,711782485,711782518,303578245,700224607>(this, NNUU.GX);
         }

         if (var1 && llsissm<"szoygpg",-1103481163,711782473,711782507,711782508,303578245,700224607>(this)) {
            llsissm<"tqfeaad",-1103481163,711782473,711782485,711782518,303578245,700224607>(this, NNUU.Gc);
            ((NNNwS)((NNuU)llsissm<"szoygpg",-1103481161,711782473,711782472,711782475,1937974429,-79348750>(this)[TP.T[4]]).T[TP.T[5]])
               .method_7277((C0071)llsissm<"rims",-1103481161,711782473,711782494,711782475,1601461415,-667155131>(this)[TP.n[0]]);
         } else {
            llsissm<"mefxr",-1103481163,711782473,711782485,711782518,303578245,700224607>(this, var1 ? NNUU.Gp : NNUU.GA);
         }
      }
   }

   private static void v() {
      z = new short[]{0, 1, 2, 4, 5};
      m = new short[]{0, 4, 0, 3, 3, 3, 3};
      d = new short[]{3, 0, 3, 3, 3, 0, 4};
      U = new short[]{3, 3, 2, 3, 0, 4, 3};
      o = new short[]{3, 0, 4};
      T = new short[]{0, 4, 0, 4, 0, 4};
      n = new short[]{3, 0, 4, 0, 4, 0, 4, 0};
      Y = new short[]{4, 0, 4};
      H = new short[]{0, 4};
      Z = new short[]{0, 4, 0, 3, 0};
      P = new short[]{4, 0, 4, 0, 4, 0, 4, 0};
      t = new short[]{4, 0, 3, 3, 3, 3};
      V = new short[]{0, 3, 0, 3, 0};
      R = new short[]{0, 0, 3, 0};
      c = new short[]{4, 4};
      I = new short[]{0, 4, 6, 6, 5, 7, 4, 4};
      e = new short[]{4, 6};
      X = new short[]{6, 6, 0, 3, 3, 3};
      w = new short[]{3, 3, 3, 4, 6};
      W = new short[]{0, 7, 7, 4, 5, 7, 7, 5};
      s = new short[]{1, 0};
      B = new short[]{4, 3, 0, 4, 3, 0};
      G = new short[]{4, 3, 3, 3};
   }

   private boolean j() {
      return ((NNNwS)((NNuU)llsissm<"ayzzvx",-1103481161,711782473,711782472,711782475,-1514110369,338388642>(this)[TP.n[1]]).T[TP.n[2]]).field_6017 > TP.j[0]
            && !((NNNwS)((NNuU)llsissm<"rims",-1103481161,711782473,711782472,711782475,731588980,247804698>(this)[TP.n[3]]).T[TP.n[4]]).method_24828()
            && !((NNNwS)((NNuU)llsissm<"xlwleny",-1103481161,711782473,711782472,711782475,1599356137,-1325954105>(this)[TP.n[5]]).T[TP.n[6]]).method_6101()
            && !((NNNwS)((NNuU)llsissm<"mefxr",-1103481161,711782473,711782472,711782475,-385028449,-1911087744>(this)[TP.n[7]]).T[TP.Y[0]]).method_5799()
            && !((NNNwS)((NNuU)llsissm<"mefxr",-1103481161,711782473,711782472,711782475,1978833905,-1315773409>(this)[TP.Y[1]]).T[TP.Y[2]]).method_74025()
            && !((NNNwS)((NNuU)llsissm<"psgrycfe",-1103481161,711782473,711782472,711782475,-1980886903,1000230507>(this)[TP.H[0]]).T[TP.H[1]]).method_5765()
            && !((NNNwS)((NNuU)llsissm<"ayzzvx",-1103481161,711782473,711782472,711782475,-1011968604,2037248064>(this)[TP.Z[0]]).T[TP.Z[1]]).method_5624()
         ? TP.v[4]
         : TP.i[0];
   }

   @Iface0642
   public void N(C0916 var1) {
      llsissm<"myhfj",-1103481163,711782473,711782492,711782495,-1103481163,-1103481163>(this);
      if ((NNNwS)((NNuU)llsissm<"ktozn",-1103481161,711782473,711782472,711782475,-1103481161,-1103481161>(this)[TP.m[0]]).T[TP.m[1]] != null
         && (NNNZg)((NNuU)llsissm<"ktozn",-1103481161,711782473,711782472,711782475,-303423778,-2092229427>(this)[TP.m[2]]).T[TP.m[3]] != null) {
         if ((C0071)llsissm<"thuxcw",-1103481161,711782473,711782494,711782475,-1412314219,-944889807>(this)[TP.m[5]] == null
            || ((C0071)llsissm<"hatwg",-1103481161,711782473,711782494,711782475,-1502164775,360052643>(this)[TP.m[6]]).method_31481()
            || ((C0071)llsissm<"tqfeaad",-1103481161,711782473,711782494,711782475,658646200,-1447409384>(this)[TP.d[0]]).method_73183()
               != (NNNZg)((NNuU)llsissm<"rims",-1103481161,711782473,711782472,711782475,973623867,-1124631551>(this)[TP.d[1]]).T[TP.d[2]]) {
            llsissm<"myhfj",-1103481163,711782473,711782489,711782495,303578245,700224607>(this);
         }

         llsissm<"psgrycfe",-1103481163,711782473,711782406,711782495,303578245,700224607>(this);
      } else {
         Object var6 = null;
         llsissm<"hatwg",-1103481161,711782473,711782494,711782475,-1103481161,-1103481161>(this)[TP.m[4]] = var6;
      }
   }

   private void N(NNUB var1) {
      ((NNNZg)((NNuU)llsissm<"ayzzvx",-1103481161,711782473,711782472,711782475,1778394813,1212199721>(this)[TP.Z[2]]).T[TP.Z[3]])
         .method_43128(
            (NNNwS)((NNuU)llsissm<"szoygpg",-1103481161,711782473,711782472,711782475,-2004122362,2059628204>(this)[TP.Z[4]]).T[TP.P[0]],
            ((NNNwS)((NNuU)llsissm<"rims",-1103481161,711782473,711782472,711782475,432152811,-346540692>(this)[TP.P[1]]).T[TP.P[2]]).method_23317(),
            ((NNNwS)((NNuU)llsissm<"mefxr",-1103481161,711782473,711782472,711782475,-750951946,146379142>(this)[TP.P[3]]).T[TP.P[4]]).method_23318(),
            ((NNNwS)((NNuU)llsissm<"thuxcw",-1103481161,711782473,711782472,711782475,496696473,563718375>(this)[TP.P[5]]).T[TP.P[6]]).method_23321(),
            var1,
            NNUW.field_15248,
            TP.Q[2],
            TP.Q[3]
         );
   }

   @Iface0642
   public void N(AttackAura_x var1) {
      llsissm<"hatwg",-1103481163,711782473,711782492,711782495,303578245,700224607>(this);
      if ((C0071)llsissm<"xlwleny",-1103481161,711782473,711782494,711782475,228097304,-770303324>(this)[TP.d[3]] != null
         && var1.m2000() == (C0071)llsissm<"ktozn",-1103481161,711782473,711782494,711782475,-817818759,-1793301407>(this)[TP.d[4]]) {
         var1.N();
         llsissm<"myhfj",-1103481163,711782473,711782484,711782495,303578245,700224607>(this);
         ((NNNwS)((NNuU)llsissm<"ayzzvx",-1103481161,711782473,711782472,711782475,1383779153,1167968642>(this)[TP.d[5]]).T[TP.d[6]]).method_7350();
      }
   }

   @Iface0642
   public void N(Blink var1) {
      llsissm<"szoygpg",-1103481163,711782473,711782492,711782495,303578245,700224607>(this);
      if ((C0071)llsissm<"szoygpg",-1103481161,711782473,711782494,711782475,766044278,49308369>(this)[TP.U[0]] != null && var1.m2000() instanceof NDg var2) {
         if (((Iface0670)var2).m2000()
            == ((C0071)llsissm<"ktozn",-1103481161,711782473,711782494,711782475,-679526938,1491861432>(this)[TP.U[1]]).method_5628()) {
            var1.N();
            var2.N((NDq)llsissm<"xlwleny",-1103481161,711782473,711782494,711782475,877019169,1185617601>(this)[TP.U[2]]);
         }
      }
   }

   private void G() {
      if (llsissm<"hatwg",-1103481161,711782473,711782494,711782475,-1103481161,-1103481161>(this) == null) {
         llsissm<"ayzzvx",-1103481162,711782473,711782494,711782475,-1103481162,-1103481162>(this, new Object[TP.a[0]]);
         Object[] var1 = llsissm<"mefxr",-1103481161,711782473,711782494,711782475,-1103481161,-1103481161>(this);
         var1[TP.a[1]] = TP.g[3];
         var1[TP.a[2]] = TP.g[4];
      }
   }

   private static void Y() {
      K = new int[]{1000000, 2000000};
   }
}

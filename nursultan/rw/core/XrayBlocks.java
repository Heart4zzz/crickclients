package rw.core;

import KDFzREm.NKL;
import KDFzREm.NNuU;
import KDFzREm.NPh;
import KDFzREm.NQa;
import KDFzREm.NQl;
import KDFzREm.NQo;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.stream.Stream;
import org.apache.logging.log4j.Logger;
import rw.NursultanClient;
import rw.data.Rec0312;
import rw.defs.Enum0059;
import rw.setting.C0106;
import rw.setting.C0135;
import rw.setting.Potion;

public class XrayBlocks {
   private static String[] f1000;
   private static String[] f2000;
   private static String[] f3000;
   private static String[] f4000;
   private static String[] f5000;
   private static String[] f6000;
   private static String[] f7000;
   private static String[] f8000;
   private static String[] f9000;
   private static String[] f10000;
   private static String[] f11000;
   private static String[] f12000;
   private static String[] f13000;
   public Object[] f14000;
   public static Object[] f15000;
   private static String[] f16000;
   private static String[] f17000;

   public Stream<rw.setting.C0156> m8000() {
      return ((Map)this.f14000[0]).values().stream();
   }

   private static String m10000(String var0) {
      return new Rec0312(f1000[6]).m12000(var0).m10000();
   }

   public XrayBlocks() {
      this.m104000();
      LinkedHashMap var5 = new LinkedHashMap();
      this.f14000[0] = var5;
      HashMap var6 = new HashMap();
      this.f14000[1] = var6;
      NursultanClient.m8000().m32000(this);
      this.m68000();
      this.m64000();
      this.m100000();
      this.m60000();
   }

   static {
      ntfClinit();
   }

   private static void m22000() {
      f17000 = new String[]{"shulker", "Шалкер", "elytra"};
      f8000 = new String[]{"Элитры", "totem-of-undying", "Тотем бессмертия", "enchanted-golden-apple", "Зачарованное золотое яблоко"};
      f3000 = new String[]{"golden-apple", "Золотое яблоко", "apple", "Яблоко", "netherite-ingot", "Незеритовый слиток", "ancient-debris", "Древние обломки"};
      f16000 = new String[]{"experience-bottle", "Пузырёк опыта", "gunpowder", "Порох", "blaze-rod", "Огненный стержень", "ender-pearl"};
      f4000 = new String[]{"Эндер жемчуг", "diamond", "Алмаз"};
      f11000 = new String[]{"gold-ingot", "Золотой слиток"};
      f5000 = new String[]{"gold-block", "Золотой блок", "diamond-ore"};
      f6000 = new String[]{"Алмазная руда", "emerald-ore"};
      f2000 = new String[]{"Изумрудная руда", "beacon", "Маяк"};
      f9000 = new String[]{
         "blaze-spawn-egg",
         "Яйцо призыва всполоха",
         "ghast-spawn-egg",
         "Яйцо призыва гаста",
         "enderman-spawn-egg",
         "Яйцо призыва эндермена",
         "creeper-spawn-egg"
      };
      f7000 = new String[]{"Яйцо призыва пиглина", "pig-spawn-egg", "Яйцо призыва свиньи", "sheep-spawn-egg"};
      f13000 = new String[]{"Яйцо призыва овцы", "villager-spawn-egg"};
      f12000 = new String[]{"Яйцо призыва крестьянина", "cow-spawn-egg", "Яйцо призыва коровы"};
      f10000 = new String[]{"zombie-villager-spawn-egg", "Яйцо призыва зомби-крестьянина"};
      f1000 = new String[]{
         "dragon-head", "Голова дракона", "wind-charge", "Заряд ветра", "heavy-core", "Навершие булавы", "autobuy.name", "error-please-report"
      };
   }

   private static void m34000() {
      f15000 = new Object[]{null};
   }

   private void m60000() {
      ((ExecutorService)NursultanClient.f13000[1]).submit(() -> {
         LinkedHashMap var1 = new LinkedHashMap();
         int var2 = 0;

         for (C0135 var4 : C0777.m22000()) {
            rw.setting.C0156 var5 = (rw.setting.C0156)((Map)this.f14000[0]).get(m10000(var4.m24000()));
            if (var5 != null) {
               try {
                  var1.put(var5, var4.m36000().t());
               } catch (Exception var7) {
                  var1.put(var5, NQa.y.E().t());
                  var2++;
                  ((Logger)f15000[0]).error(var7, var7);
               }
            }
         }

         int var8 = var2;
         NNuU.Nq().execute(() -> {
            var1.forEach((var0x, var1xx) -> ((rw.setting.C0156)var0x).m78000((NQo)var1xx));

            for (int var2x = 0; var2x < var8; var2x++) {
               C0106.m32000(C1188.m12000(f1000[7]).N(NPh.field_1061));
            }
         });
      });
   }

   private void m64000() {
      this.m96000(new C0105(NQa.sT.E(), f17000[2], f8000[0], (Enum0059)Enum0059.f3000[0]));
      this.m96000(new C0105(NQa.la.E(), f8000[1], f8000[2], (Enum0059)Enum0059.f3000[0]));
      this.m92000(NQa.be, f8000[3], f8000[4]);
      this.m92000(NQa.bV, f3000[0], f3000[1]);
      this.m92000(NQa.sS, f3000[2], f3000[3]);
      this.m92000(NQa.TE, f3000[4], f3000[5]);
      this.m92000(NKL.Tz.B(), f3000[6], f3000[7]);
      this.m92000(NQa.GB, f16000[0], f16000[1]);
      this.m92000(NQa.bN, f16000[2], f16000[3]);
      this.m92000(NQa.nU, f16000[4], f16000[5]);
      this.m92000(NQa.nz, f16000[6], f4000[0]);
      this.m92000(NQa.TN, f4000[1], f4000[2]);
      this.m92000(NQa.TU, f11000[0], f11000[1]);
      this.m92000(NQa.NX, f5000[0], f5000[1]);
      this.m92000(NQa.Nk.B(), f5000[2], f6000[0]);
      this.m92000(NQa.NG.B(), f6000[1], f2000[0]);
      this.m92000(NQa.Bw.B(), f2000[1], f2000[2]);
      this.m92000(NQa.tf, f9000[0], f9000[1]);
      this.m92000(NQa.tC, f9000[2], f9000[3]);
      this.m92000(NQa.Gi, f9000[4], f9000[5]);
      this.m92000(NQa.tJ, f9000[6], f7000[0]);
      this.m92000(NQa.nk, f7000[1], f7000[2]);
      this.m92000(NQa.nY, f7000[3], f13000[0]);
      this.m92000(NQa.tW, f13000[1], f12000[0]);
      this.m92000(NQa.nw, f12000[1], f12000[2]);
      this.m92000(NQa.tY, f10000[0], f10000[1]);
      this.m92000(NQa.GQ, f1000[0], f1000[1]);
      this.m92000(NQa.Gz, f1000[2], f1000[3]);
      this.m92000(NQa.NK, f1000[4], f1000[5]);
   }

   private void m68000() {
      for (C0135 var2 : C0777.m22000()) {
         Potion var3 = new Potion(var2.m18000().E(), var2.m24000(), var2.m32000(), var2.m2000());
         this.m96000(var3);
      }
   }

   public Map<String, rw.setting.C0156> m76000() {
      return (Map<String, rw.setting.C0156>)this.f14000[0];
   }

   public Optional<rw.setting.C0156> m84000(String var1) {
      rw.setting.C0156 var2 = (rw.setting.C0156)((Map)this.f14000[0]).get(var1);
      if (var2 == null) {
         var2 = (rw.setting.C0156)((Map)this.f14000[1]).get(var1);
      }

      return Optional.ofNullable(var2);
   }

   public Map<String, rw.setting.C0156> m86000() {
      return (Map<String, rw.setting.C0156>)this.f14000[1];
   }

   private void m92000(NQl var1, String var2, String var3) {
      rw.setting.C0156 var4 = new rw.setting.C0156(var1.E(), var2, var3, (Enum0059)Enum0059.f3000[0]);
      this.m96000(var4);
   }

   private void m96000(rw.setting.C0156 var1) {
      ((Map)this.f14000[0]).put(var1.m4000().m10000(), var1);
      ((Map)this.f14000[1]).put(var1.m82000(), var1);
   }

   private void m100000() {
      C1075 var1 = new C1075(NQa.zS.E(), f17000[0], f17000[1], (Enum0059)Enum0059.f3000[0]);
      this.m96000(var1);
   }

   private void m104000() {
      if (this.f14000 == null) {
         this.f14000 = new Object[2];
         Object[] var1 = this.f14000;
      }
   }
}

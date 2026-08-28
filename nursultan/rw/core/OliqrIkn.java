package rw.core;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import rw.data.Rec0244;

public class OliqrIkn {
   private static String[] f1000;
   public Object[] f2000;
   public static Object[] f3000;

   private void m2000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
      }
   }

   public OliqrIkn(Path var1) {
      this.m2000();
      this.f2000[0] = var1;
   }

   static {
      ntfClinit();
   }

   private Map<String, List<Rec0244>> m10000() throws IOException {
      try {
         Map var1 = (Map)((Gson)f3000[0]).fromJson(Files.readString((Path)this.f2000[0], StandardCharsets.UTF_8), (Type)f3000[1]);
         return (Map<String, List<Rec0244>>)(var1 == null ? new LinkedHashMap<>() : var1);
      } catch (JsonParseException var2) {
         return new LinkedHashMap<>();
      }
   }

   private static void m12000() {
      f3000 = new Object[]{null, null, null, f1000[2]};
   }

   private static void m16000() {
      f1000 = new String[]{"{}", "yyyy-MM-dd HH:mm:ss", "{}"};
   }

   public void m28000(String var1, String var2, String var3) throws IOException {
      this.m34000();
      Map var4 = this.m10000();
      List var5 = var4.computeIfAbsent(var1, var0 -> new ArrayList());
      Rec0244 var6 = new Rec0244(var2, var3, LocalDateTime.now().format((DateTimeFormatter)f3000[2]));
      int var7 = m32000(var5, var2);
      if (var7 >= 0) {
         var5.set(var7, var6);
      } else {
         var5.add(var6);
      }

      Files.writeString((Path)this.f2000[0], ((Gson)f3000[0]).toJson(var4, (Type)f3000[1]), StandardCharsets.UTF_8);
   }

   private static int m32000(List<Rec0244> var0, String var1) {
      for (int var2 = 0; var2 < var0.size(); var2++) {
         if (var1.equals(((Rec0244)var0.get(var2)).m2000())) {
            return var2;
         }
      }

      return -1;
   }

   public Path m34000() throws IOException {
      Path var1 = ((Path)this.f2000[0]).getParent();
      if (var1 != null) {
         if (Files.notExists(var1)) {
            Files.createDirectories(var1);
         } else if (!Files.isDirectory(var1)) {
            Files.deleteIfExists(var1);
            Files.createDirectories(var1);
         }
      }

      if (Files.notExists((Path)this.f2000[0])) {
         Files.writeString((Path)this.f2000[0], f1000[0], StandardCharsets.UTF_8);
      }

      return (Path)this.f2000[0];
   }

   public Optional<Rec0244> m38000(String var1, String var2) {
      if (Files.notExists((Path)this.f2000[0])) {
         return Optional.empty();
      } else {
         try {
            List var3 = this.m10000().get(var1);
            return var3 == null ? Optional.empty() : var3.stream().filter(var1x -> var2.equals(var1x.m2000())).findFirst();
         } catch (IOException var4) {
            return Optional.empty();
         }
      }
   }
}

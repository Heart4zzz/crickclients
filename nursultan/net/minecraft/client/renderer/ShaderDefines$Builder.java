package net.minecraft.client.renderer;

import KDFzREm.Ok;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;

public class ShaderDefines$Builder {
   private final Builder<String, String> values = ImmutableMap.builder();
   private final com.google.common.collect.ImmutableSet.Builder<String> flags = ImmutableSet.builder();

   ShaderDefines$Builder() {
   }

   private static String escapeNewLines(String var0) {
      return var0.replaceAll("\n", "\\\\\n");
   }

   public Ok N() {
      return new Ok(this.values.build(), this.flags.build());
   }

   public ShaderDefines$Builder N(String var1) {
      this.flags.add(var1);
      return this;
   }

   public ShaderDefines$Builder N(String var1, int var2) {
      this.values.put(var1, String.valueOf(var2));
      return this;
   }

   public ShaderDefines$Builder N(String var1, float var2) {
      this.values.put(var1, String.valueOf(var2));
      return this;
   }

   public ShaderDefines$Builder N(String var1, String var2) {
      if (var2.isBlank()) {
         throw new IllegalArgumentException("Cannot define empty string");
      } else {
         this.values.put(var1, escapeNewLines(var2));
         return this;
      }
   }
}

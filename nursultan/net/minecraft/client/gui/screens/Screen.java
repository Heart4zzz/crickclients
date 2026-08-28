package net.minecraft.client.gui.screens;

import KDFzREm.NAN;
import KDFzREm.NNNJm;
import KDFzREm.NNYH;
import KDFzREm.NNal;
import KDFzREm.NNdc;
import KDFzREm.NNxm;
import net.minecraft.server.commands.TeamCommand;
import rw.defs.Enum0013;
import rw.defs.Enum0015;
import rw.defs.InventoryPositionAware;
import rw.gui.WheelTweak;

public class Screen extends NNYH {
   private final NNYH N;

   public Screen(NNYH var1) {
      super(NAN.y("Mouse Tweaks Options"));
      this.N = var1;
   }

   protected void method_25426() {
      TeamCommand.N.m10000();
      this.method_37063(new NNNJm(this.field_22789 / 2 - this.field_22793.N(this.field_22785) / 2, 15, this.field_22789, 9, this.field_22785, this.field_22793));
      this.method_37063(
         NNxm.N(TeamCommand.N.f3000)
            .N(this.field_22789 / 2 - 155, this.field_22790 / 6, 150, 20, NAN.y("RMB Tweak"), (var0, var1) -> TeamCommand.N.f3000 = var1)
      );
      this.method_37063(
         NNxm.N(TeamCommand.N.f6000)
            .N(this.field_22789 / 2 - 155, this.field_22790 / 6 + 24, 150, 20, NAN.y("Wheel Tweak"), (var0, var1) -> TeamCommand.N.f6000 = var1)
      );
      this.method_37063(
         NNxm.N(TeamCommand.N.f4000)
            .N(this.field_22789 / 2 + 5, this.field_22790 / 6, 150, 20, NAN.y("LMB Tweak With Item"), (var0, var1) -> TeamCommand.N.f4000 = var1)
      );
      this.method_37063(
         NNxm.N(TeamCommand.N.f5000)
            .N(this.field_22789 / 2 + 5, this.field_22790 / 6 + 24, 150, 20, NAN.y("LMB Tweak Without Item"), (var0, var1) -> TeamCommand.N.f5000 = var1)
      );
      this.method_37063(
         NNxm.N(var0 -> {
               return NAN.y(switch (var0) {
                  case f1000 -> "First to Last";
                  case f2000 -> "Last to First";
               });
            }, TeamCommand.N.f7000)
            .N(new Enum0013[]{Enum0013.f1000, Enum0013.f2000})
            .N(this.field_22789 / 2 - 155, this.field_22790 / 6 + 48, 310, 20, NAN.y("Wheel Tweak Search Order"), (var0, var1) -> TeamCommand.N.f7000 = var1)
      );
      this.method_37063(
         NNxm.N(var0 -> {
               return NAN.y(switch (var0) {
                  case f1000 -> "Down to Push, Up to Pull";
                  case f2000 -> "Up to Push, Down to Pull";
                  case f3000 -> "Inventory Position Aware";
                  case f4000 -> "Inventory Position Aware, Inverted";
               });
            }, TeamCommand.N.f8000)
            .N(
               new InventoryPositionAware[]{
                  InventoryPositionAware.f1000, InventoryPositionAware.f2000, InventoryPositionAware.f3000, InventoryPositionAware.f4000
               }
            )
            .N(this.field_22789 / 2 - 155, this.field_22790 / 6 + 72, 310, 20, NAN.y("Scroll Direction"), (var0, var1) -> TeamCommand.N.f8000 = var1)
      );
      this.method_37063(
         NNxm.N(var0 -> {
               return NAN.y(switch (var0) {
                  case f1000 -> "Multiple Wheel Clicks Move Multiple Items";
                  case f2000 -> "Always Move One Item (macOS Compatibility)";
               });
            }, TeamCommand.N.f9000)
            .N(new Enum0015[]{Enum0015.f1000, Enum0015.f2000})
            .N(this.field_22789 / 2 - 155, this.field_22790 / 6 + 96, 310, 20, NAN.y("Scroll Scaling"), (var0, var1) -> TeamCommand.N.f9000 = var1)
      );
      this.method_37063(
         NNxm.N(WheelTweak.f10000)
            .N(this.field_22789 / 2 - 155, this.field_22790 / 6 + 120, 310, 20, NAN.y("Debug Mode"), (var0, var1) -> WheelTweak.f10000 = var1)
      );
      this.method_37063(NNdc.method_46430(NNal.u, var1 -> this.method_25419()).N(this.field_22789 / 2 - 100, this.field_22790 - 27, 200, 20).N());
   }

   public void method_25432() {
      TeamCommand.N.m2000();
   }

   public void method_25419() {
      this.field_22787.N(this.N);
   }
}

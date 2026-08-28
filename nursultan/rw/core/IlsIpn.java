package rw.core;

public class IlsIpn extends C0891<WaypointXPart> {
   static {
      ntfClinit();
   }

   public void m2000(WaypointXPart var1) {
      this.removeIf(var1x -> {
         if (!var1x.m22000() && var1x.hashCode() != var1.hashCode()) {
            return (boolean)0;
         } else {
            var1x.m6000();
            return (boolean)1;
         }
      });
   }
}

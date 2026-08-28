package rw.cmd;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.Nog;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import org.joml.Vector2d;

public class C0022 implements ArgumentType<Vector2d> {
   static {
      ntfClinit();
   }

   public static Vector2d m8000(CommandContext<Nog> var0, String var1) {
      return (Vector2d)var0.getArgument(var1, Vector2d.class);
   }

   public Vector2d m12000(StringReader var1) throws CommandSyntaxException {
      NNuU var2 = NNuU.Nq();
      double var3;
      if (var1.peek() == '~') {
         var3 = ((NNNwS)var2.T[4]).method_23317();
         var1.skip();
      } else {
         var3 = var1.readDouble();
      }

      if (var1.peek() == ' ') {
         var1.skip();
      }

      double var5;
      if (var1.peek() == '~') {
         var5 = ((NNNwS)var2.T[4]).method_23321();
         var1.skip();
      } else {
         var5 = var1.readDouble();
      }

      return new Vector2d(var3, var5);
   }
}

package rw.cmd;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.Nog;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import org.joml.Vector3d;

public class C0004 implements ArgumentType<Vector3d> {
   static {
      ntfClinit();
   }

   public Vector3d m12000(StringReader var1) throws CommandSyntaxException {
      NNuU var2 = NNuU.Nq();
      int var3;
      if (var1.peek() == '~') {
         var3 = (int)((NNNwS)var2.T[4]).method_23317();
         var1.skip();
      } else {
         var3 = var1.readInt();
      }

      if (var1.peek() == ' ') {
         var1.skip();
      }

      int var4;
      if (var1.peek() == '~') {
         var4 = (int)((NNNwS)var2.T[4]).method_23318();
         var1.skip();
      } else {
         var4 = var1.readInt();
      }

      if (var1.peek() == ' ') {
         var1.skip();
      }

      int var5;
      if (var1.peek() == '~') {
         var5 = (int)((NNNwS)var2.T[4]).method_23321();
         var1.skip();
      } else {
         var5 = var1.readInt();
      }

      return new Vector3d(var3, var4, var5);
   }

   public static Vector3d m14000(CommandContext<Nog> var0, String var1) {
      return (Vector3d)var0.getArgument(var1, Vector3d.class);
   }
}

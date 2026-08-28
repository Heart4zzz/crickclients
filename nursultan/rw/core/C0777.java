package rw.core;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import rw.api.Iface0020;
import rw.defs.Enum0059;
import rw.setting.C0135;

public class C0777 {
   @Iface0020(
      L = "potion.paladin",
      y = "Зелье Палладина",
      N = Enum0059.POTIONS
   )
   public static final C0135 f1000;
   @Iface0020(
      L = "armor.boots.crush",
      y = "Ботинки Крушителя",
      N = Enum0059.ARMOR
   )
   public static final C0135 f2000;
   @Iface0020(
      L = "arrow.blood",
      y = "Кровавая Стрела",
      N = Enum0059.ARROWS
   )
   public static final C0135 f3000;
   @Iface0020(
      L = "sphere.bestia",
      y = "Сфера Бестии",
      N = Enum0059.SPHERES
   )
   public static final C0135 f4000;
   @Iface0020(
      L = "potion.assassin",
      y = "Зелье Ассасина",
      N = Enum0059.POTIONS
   )
   public static final C0135 f5000;
   @Iface0020(
      L = "tool.trident.crush",
      y = "Трезубец Крушителя",
      N = Enum0059.TOOLS
   )
   public static final C0135 f6000;
   @Iface0020(
      L = "consumable.passkey.armor",
      y = "Отмычка к Броне",
      N = Enum0059.CONSUMABLES
   )
   public static final C0135 f7000;
   @Iface0020(
      L = "consumable.dust",
      y = "Явная пыль",
      N = Enum0059.CONSUMABLES
   )
   public static final C0135 f8000;
   @Iface0020(
      L = "consumable.stratum",
      y = "Пласт",
      N = Enum0059.CONSUMABLES
   )
   public static final C0135 f9000;
   @Iface0020(
      L = "potion.radiation",
      y = "Зелье Радиации",
      N = Enum0059.POTIONS
   )
   public static final C0135 f10000;
   @Iface0020(
      L = "consumable.passkey.spheres",
      y = "Отмычка к Сферам",
      N = Enum0059.CONSUMABLES
   )
   public static final C0135 f11000;
   @Iface0020(
      L = "arrow.zeus",
      y = "Стрела Зевса",
      N = Enum0059.ARROWS
   )
   public static final C0135 f12000;
   @Iface0020(
      L = "potion.holy-water",
      y = "Святая вода",
      N = Enum0059.POTIONS
   )
   public static final C0135 f13000;
   @Iface0020(
      L = "tal.demona",
      y = "Талисман Демона",
      N = Enum0059.TALISMANS
   )
   public static final C0135 f14000;
   @Iface0020(
      L = "armor.helmet.crush",
      y = "Шлем Крушителя",
      N = Enum0059.ARMOR
   )
   public static final C0135 f15000;
   private static byte[] f16000;
   @Iface0020(
      L = "consumable.passkey.items",
      y = "Отмычка к Ресурсам",
      N = Enum0059.CONSUMABLES
   )
   public static final C0135 f17000;
   @Iface0020(
      L = "arrow.rejuvenation",
      y = "Стрела терапии",
      N = Enum0059.ARROWS
   )
   public static final C0135 f18000;
   @Iface0020(
      L = "arrow.light",
      y = "Световая Стрела",
      N = Enum0059.ARROWS
   )
   public static final C0135 f19000;
   @Iface0020(
      L = "tool.pickaxe.crush",
      y = "Кирка Крушителя",
      N = Enum0059.TOOLS
   )
   public static final C0135 f20000;
   @Iface0020(
      L = "tool.mace.crush",
      y = "Булава Крушителя",
      N = Enum0059.TOOLS
   )
   public static final C0135 f21000;
   public static Object[] f22000;
   @Iface0020(
      L = "potion.rage",
      y = "Зелье Гнева",
      N = Enum0059.POTIONS
   )
   public static final C0135 f23000;
   @Iface0020(
      L = "block.tnt.black",
      y = "Блэк",
      N = Enum0059.BLOCKS
   )
   public static final C0135 f24000;
   @Iface0020(
      L = "block.tnt.while",
      y = "Вайт",
      N = Enum0059.BLOCKS
   )
   public static final C0135 f25000;
   @Iface0020(
      L = "consumable.disorientation",
      y = "Дезориентация",
      N = Enum0059.CONSUMABLES
   )
   public static final C0135 f26000;
   @Iface0020(
      L = "tal.mraka",
      y = "Талисман Мрака",
      N = Enum0059.TALISMANS
   )
   public static final C0135 f27000;
   @Iface0020(
      L = "consumable.goods-aura",
      y = "Божья Аура",
      N = Enum0059.CONSUMABLES
   )
   public static final C0135 f28000;
   @Iface0020(
      L = "tal.tirana",
      y = "Талисман Тирана",
      N = Enum0059.TALISMANS
   )
   public static final C0135 f29000;
   @Iface0020(
      L = "arrow.freeze",
      y = "Стрела Обледенения",
      N = Enum0059.ARROWS
   )
   public static final C0135 f30000;
   @Iface0020(
      L = "arrow.agony",
      y = "Мучительная Стрела",
      N = Enum0059.ARROWS
   )
   public static final C0135 f31000;
   @Iface0020(
      L = "sphere.ikara",
      y = "Сфера Икара",
      N = Enum0059.SPHERES
   )
   public static final C0135 f32000;
   @Iface0020(
      L = "consumable.snowball",
      y = "Снежок Заморозка",
      N = Enum0059.CONSUMABLES
   )
   public static final C0135 f33000;
   @Iface0020(
      L = "tool.crossbow.crush",
      y = "Арбалет Крушителя",
      N = Enum0059.TOOLS
   )
   public static final C0135 f34000;
   @Iface0020(
      L = "armor.chestplate.crush",
      y = "Нагрудник Крушителя",
      N = Enum0059.ARMOR
   )
   public static final C0135 f35000;
   @Iface0020(
      L = "tal.yarosti",
      y = "Талисман Ярости",
      N = Enum0059.TALISMANS
   )
   public static final C0135 f36000;
   @Iface0020(
      L = "tal.razdora",
      y = "Талисман Раздора",
      N = Enum0059.TALISMANS
   )
   public static final C0135 f37000;
   @Iface0020(
      L = "consumable.trap",
      y = "Трапка",
      N = Enum0059.CONSUMABLES
   )
   public static final C0135 f38000;
   @Iface0020(
      L = "sphere.gidra",
      y = "Сфера Гидры",
      N = Enum0059.SPHERES
   )
   public static final C0135 f39000;
   @Iface0020(
      L = "consumable.passkey.weapon",
      y = "Отмычка к Оружию",
      N = Enum0059.CONSUMABLES
   )
   public static final C0135 f40000;
   @Iface0020(
      L = "tal.crush",
      y = "Талисман Крушителя",
      N = Enum0059.TALISMANS
   )
   public static final C0135 f41000;
   @Iface0020(
      L = "potion.drowsiness",
      y = "Зелье Снотворное",
      N = Enum0059.POTIONS
   )
   public static final C0135 f42000;
   @Iface0020(
      L = "tool.bow.crush",
      y = "Лук",
      N = Enum0059.TOOLS
   )
   public static final C0135 f43000;
   @Iface0020(
      L = "armor.leggings.crush",
      y = "Поножи Крушителя",
      N = Enum0059.ARMOR
   )
   public static final C0135 f44000;
   @Iface0020(
      L = "armor.elytra.unbreakable",
      y = "Нерушимые Элитры",
      N = Enum0059.ARMOR
   )
   public static final C0135 f45000;
   @Iface0020(
      L = "tal.karatel",
      y = "Талисман Карателя",
      N = Enum0059.TALISMANS
   )
   public static final C0135 f46000;
   @Iface0020(
      L = "tal.vihrya",
      y = "Талисман Вихря",
      N = Enum0059.TALISMANS
   )
   public static final C0135 f47000;
   private static String[] f48000;
   @Iface0020(
      L = "sphere.erida",
      y = "Сфера Эрида",
      N = Enum0059.SPHERES
   )
   public static final C0135 f49000;
   @Iface0020(
      L = "sphere.aresa",
      y = "Сфера Ареса",
      N = Enum0059.SPHERES
   )
   public static final C0135 f50000;
   @Iface0020(
      L = "tool.sword.crush",
      y = "Меч Крушителя",
      N = Enum0059.TOOLS
   )
   public static final C0135 f51000;
   @Iface0020(
      L = "consumable.passkey.tools",
      y = "Отмычка к Инструментам",
      N = Enum0059.CONSUMABLES
   )
   public static final C0135 f52000;
   @Iface0020(
      L = "sphere.haosa",
      y = "Сфера Хаоса",
      N = Enum0059.SPHERES
   )
   public static final C0135 f53000;
   private static short[] f54000;
   private static boolean[] f55000;
   @Iface0020(
      L = "sphere.satira",
      y = "Сфера Сатира",
      N = Enum0059.SPHERES
   )
   public static final C0135 f56000;
   @Iface0020(
      L = "potion.popper",
      y = "Хлопушка",
      N = Enum0059.POTIONS
   )
   public static final C0135 f57000;
   @Iface0020(
      L = "block.damager",
      y = "Блок Дамагер",
      N = Enum0059.BLOCKS
   )
   public static final C0135 f58000;

   private static void m4000() {
      f48000 = new String[]{"This is a utility class and cannot be instantiated", "Failed to init custom items from annotations"};
   }

   private static void m8000() {
      f22000 = new Object[]{null, null};
   }

   private C0777() {
      throw new UnsupportedOperationException(f48000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f55000 = new boolean[]{false, true, false, false, true};
   }

   private static void m14000() {
      f16000 = new byte[]{2};
   }

   public static Iterable<C0135> m22000() {
      return ((Map)f22000[f54000[0]]).values();
   }

   public static Stream<C0135> m28000() {
      return ((Map)f22000[f54000[1]]).values().stream();
   }

   public static List<C0135> m30000(Enum0059 var0) {
      return (List<C0135>)((Map)f22000[f54000[3]]).get(var0);
   }

   public static C0135 m32000(String var0) {
      return (C0135)((Map)f22000[f54000[2]]).get(var0);
   }

   private static void m34000() {
      f54000 = new short[]{0, 0, 0, 1};
   }
}

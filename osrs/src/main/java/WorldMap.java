import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qf")
@Implements("WorldMap")
public class WorldMap {
    @ObfuscatedName("k")
    @ObfuscatedSignature(
            descriptor = "Lqy;"
    )
    static final FontName fontNameVerdana11;
    @ObfuscatedName("c")
    @ObfuscatedSignature(
            descriptor = "Lqy;"
    )
    static final FontName fontNameVerdana13;
    @ObfuscatedName("r")
    @ObfuscatedSignature(
            descriptor = "Lqy;"
    )
    static final FontName fontNameVerdana15;
    @ObfuscatedName("i")
    @ObfuscatedSignature(
            descriptor = "Lln;"
    )
    AbstractArchive WorldMap_archive;
    @ObfuscatedName("n")
    @ObfuscatedSignature(
            descriptor = "Lln;"
    )
    AbstractArchive WorldMap_geographyArchive;
    @ObfuscatedName("l")
    @ObfuscatedSignature(
            descriptor = "Lln;"
    )
    AbstractArchive WorldMap_groundArchive;
    @ObfuscatedName("b")
    @ObfuscatedSignature(
            descriptor = "Lnv;"
    )
    Font font;
    @ObfuscatedName("m")
    HashMap fonts;
    @ObfuscatedName("t")
    @ObfuscatedSignature(
            descriptor = "[Lrg;"
    )
    IndexedSprite[] mapSceneSprites;
    @ObfuscatedName("h")
    HashMap details;
    @ObfuscatedName("p")
    @ObfuscatedSignature(
            descriptor = "Lii;"
    )
    WorldMapArea mainMapArea;
    @ObfuscatedName("o")
    @ObfuscatedSignature(
            descriptor = "Lii;"
    )
    WorldMapArea currentMapArea;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "Lii;"
   )
   WorldMapArea field3873;
    @ObfuscatedName("x")
    @ObfuscatedSignature(
            descriptor = "Lic;"
    )
    WorldMapManager worldMapManager;
    @ObfuscatedName("a")
    @ObfuscatedSignature(
            descriptor = "Lqz;"
    )
    WorldMapArchiveLoader cacheLoader;
    @ObfuscatedName("q")
    int centerTileX;
    @ObfuscatedName("d")
    int centerTileY;
    @ObfuscatedName("e")
    int worldMapTargetX = -1;
    @ObfuscatedName("g")
    int worldMapTargetY = -1;
    @ObfuscatedName("y")
    float zoom;
    @ObfuscatedName("af")
    float zoomTarget;
    @ObfuscatedName("aa")
    int worldMapDisplayWidth = -1;
    @ObfuscatedName("ai")
    int worldMapDisplayHeight = -1;
    @ObfuscatedName("ag")
    int worldMapDisplayX = -1;
    @ObfuscatedName("aw")
    int worldMapDisplayY = -1;
    @ObfuscatedName("ar")
    int maxFlashCount = 3;
    @ObfuscatedName("al")
    int cyclesPerFlash = 50;
    @ObfuscatedName("at")
    boolean perpetualFlash = false;
    @ObfuscatedName("aj")
    HashSet flashingElements = null;
    @ObfuscatedName("ax")
    int flashCount = -1;
    @ObfuscatedName("az")
    int flashCycle = -1;
   @ObfuscatedName("ap")
   int field3892 = -1;
   @ObfuscatedName("ay")
   int field3893 = -1;
   @ObfuscatedName("ac")
   int field3894 = -1;
   @ObfuscatedName("av")
   int field3899 = -1;
   @ObfuscatedName("aq")
   long field3895;
   @ObfuscatedName("ak")
   int field3897;
   @ObfuscatedName("au")
   int field3898;
   @ObfuscatedName("ae")
   boolean field3885 = true;
    @ObfuscatedName("ab")
    HashSet enabledElements = new HashSet();
    @ObfuscatedName("an")
    HashSet enabledCategories = new HashSet();
    @ObfuscatedName("am")
    HashSet enabledElementIds = new HashSet();
   @ObfuscatedName("as")
   HashSet field3903 = new HashSet();
    @ObfuscatedName("ao")
    boolean elementsDisabled = false;
   @ObfuscatedName("bj")
   int field3896 = 0;
    @ObfuscatedName("bz")
    final int[] menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012};
   @ObfuscatedName("br")
   List field3907;
    @ObfuscatedName("bm")
    Iterator iconIterator;
   @ObfuscatedName("be")
   HashSet field3916 = new HashSet();
    @ObfuscatedName("bo")
    @ObfuscatedSignature(
            descriptor = "Lko;"
    )
    Coord mouseCoord = null;
    @ObfuscatedName("bl")
    public boolean showCoord = false;
    @ObfuscatedName("bq")
    @ObfuscatedSignature(
            descriptor = "Lrs;"
    )
    SpritePixels sprite;
    @ObfuscatedName("bn")
    int cachedPixelsPerTile;
    @ObfuscatedName("bi")
    int minCachedTileX = -1;
    @ObfuscatedName("bw")
    int minCachedTileY = -1;
   @ObfuscatedName("bt")
   int field3914 = -1;

   static {
      fontNameVerdana11 = FontName.FontName_verdana11;
      fontNameVerdana13 = FontName.FontName_verdana13;
      fontNameVerdana15 = FontName.FontName_verdana15;
   }

    @ObfuscatedName("f")
    @ObfuscatedSignature(
            descriptor = "(Lln;Lln;Lln;Lnv;Ljava/util/HashMap;[Lrg;B)V",
            garbageValue = "34"
    )
    public void init(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, Font var4, HashMap var5, IndexedSprite[] var6) {
      this.mapSceneSprites = var6;
      this.WorldMap_archive = var1;
      this.WorldMap_geographyArchive = var2;
      this.WorldMap_groundArchive = var3;
      this.font = var4;
      this.fonts = new HashMap();
      this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_small, var5.get(fontNameVerdana11));
      this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_medium, var5.get(fontNameVerdana13));
      this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_large, var5.get(fontNameVerdana15));
      this.cacheLoader = new WorldMapArchiveLoader(var1);
      int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field2395.name);
      int[] var8 = this.WorldMap_archive.getGroupFileIds(var7);
      this.details = new HashMap(var8.length);

      for(int var9 = 0; var9 < var8.length; ++var9) {
         Buffer var10 = new Buffer(this.WorldMap_archive.takeFile(var7, var8[var9]));
         WorldMapArea var11 = new WorldMapArea();
         var11.read(var10, var8[var9]);
         this.details.put(var11.getInternalName(), var11);
         if (var11.getIsMain()) {
            this.mainMapArea = var11;
         }
      }

      this.setCurrentMapArea(this.mainMapArea);
      this.field3873 = null;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-48"
   )
   public void method2233() {
      World.method386();
   }

    @ObfuscatedName("v")
    @ObfuscatedSignature(
            descriptor = "(IIZIIIIB)V",
            garbageValue = "25"
    )
    public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if (this.cacheLoader.isLoaded()) {
         this.smoothZoom();
         this.scrollToTarget();
         if (var3) {
            int var8 = (int)Math.ceil((double)((float)var6 / this.zoom));
            int var9 = (int)Math.ceil((double)((float)var7 / this.zoom));
            List var10 = this.worldMapManager.method1394(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2);
            HashSet var11 = new HashSet();

            Iterator var12;
            AbstractWorldMapIcon var13;
            ScriptEvent var14;
            WorldMapEvent var15;
            for(var12 = var10.iterator(); var12.hasNext(); WorldMapAreaData.runScriptEvent(var14)) {
               var13 = (AbstractWorldMapIcon)var12.next();
               var11.add(var13);
               var14 = new ScriptEvent();
               var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
               var14.setArgs(new Object[]{var15, var1, var2});
               if (this.field3916.contains(var13)) {
                  var14.setType(17);
               } else {
                  var14.setType(15);
               }
            }

            var12 = this.field3916.iterator();

            while(var12.hasNext()) {
               var13 = (AbstractWorldMapIcon)var12.next();
               if (!var11.contains(var13)) {
                  var14 = new ScriptEvent();
                  var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
                  var14.setArgs(new Object[]{var15, var1, var2});
                  var14.setType(16);
                  WorldMapAreaData.runScriptEvent(var14);
               }
            }

            this.field3916 = var11;
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(IIZZB)V",
      garbageValue = "-126"
   )
   public void method2235(int var1, int var2, boolean var3, boolean var4) {
      long var5;
      label33: {
         var5 = class153.clockNow();
         this.method2257(var1, var2, var4, var5);
         if (!this.hasTarget() && (var4 || var3)) {
            boolean var7 = Client.clickedWidget != null;
            if (!var7) {
               if (var4) {
                  this.field3894 = var1;
                  this.field3899 = var2;
                  this.field3892 = this.centerTileX;
                  this.field3893 = this.centerTileY;
               }

               if (this.field3892 != -1) {
                  int var8 = var1 - this.field3894;
                  int var9 = var2 - this.field3899;
                  this.setWorldMapPosition(this.field3892 - (int)((float)var8 / this.zoomTarget), (int)((float)var9 / this.zoomTarget) + this.field3893, false);
               }
               break label33;
            }
         }

         this.method2238();
      }

      if (var4) {
         this.field3895 = var5;
         this.field3897 = var1;
         this.field3898 = var2;
      }

   }

   @ObfuscatedName("z")
   void method2257(int var1, int var2, boolean var3, long var4) {
      if (this.currentMapArea != null) {
         int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom);
         int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom);
         this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64);
         if (this.mouseCoord != null && var3) {
            class205 var8 = Client.keyHandlerInstance;
            boolean var10 = Client.staffModLevel >= 2;
            if (var10 && var8.getKeyPressed(82) && var8.getKeyPressed(81)) {
               class168.method891(this.mouseCoord.x, this.mouseCoord.y, this.mouseCoord.plane, false);
            } else {
               boolean var11 = true;
               if (this.field3885) {
                  int var12 = var1 - this.field3897;
                  int var13 = var2 - this.field3898;
                  if (var4 - this.field3895 > 500L || var12 < -25 || var12 > 25 || var13 < -25 || var13 > 25) {
                     var11 = false;
                  }
               }

               if (var11) {
                  PacketBufferNode var14 = Renderable.getPacketBufferNode(ClientPacket.field2441, Client.packetWriter.isaacCipher);
                  var14.packetBuffer.method2414(this.mouseCoord.packed());
                  Client.packetWriter.addNode(var14);
                  this.field3895 = 0L;
               }
            }
         }
      } else {
         this.mouseCoord = null;
      }

   }

    @ObfuscatedName("j")
    @ObfuscatedSignature(
            descriptor = "(I)V",
            garbageValue = "-93072878"
    )
    void smoothZoom() {
      if (class136.field1293 != null) {
         this.zoom = this.zoomTarget;
      } else {
         if (this.zoom < this.zoomTarget) {
            this.zoom = Math.min(this.zoomTarget, this.zoom / 30.0F + this.zoom);
         }

         if (this.zoom > this.zoomTarget) {
            this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F);
         }

      }
   }

    @ObfuscatedName("i")
    @ObfuscatedSignature(
            descriptor = "(B)V",
            garbageValue = "14"
    )
    void scrollToTarget() {
      if (this.hasTarget()) {
         int var1 = this.worldMapTargetX - this.centerTileX;
         int var2 = this.worldMapTargetY - this.centerTileY;
         if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
         }

         if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         this.setWorldMapPosition(var1 + this.centerTileX, var2 + this.centerTileY, true);
         if (this.worldMapTargetX == this.centerTileX && this.centerTileY == this.worldMapTargetY) {
            this.worldMapTargetX = -1;
            this.worldMapTargetY = -1;
         }

      }
   }

    @ObfuscatedName("n")
    @ObfuscatedSignature(
            descriptor = "(IIZI)V",
            garbageValue = "16777215"
    )
    final void setWorldMapPosition(int var1, int var2, boolean var3) {
      this.centerTileX = var1;
      this.centerTileY = var2;
      class153.clockNow();
      if (var3) {
         this.method2238();
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-551839852"
   )
   final void method2238() {
      this.field3899 = -1;
      this.field3894 = -1;
      this.field3893 = -1;
      this.field3892 = -1;
   }

    @ObfuscatedName("k")
    @ObfuscatedSignature(
            descriptor = "(I)Z",
            garbageValue = "-927578331"
    )
    boolean hasTarget() {
      return this.worldMapTargetX != -1 && this.worldMapTargetY != -1;
   }

    @ObfuscatedName("c")
    @ObfuscatedSignature(
            descriptor = "(IIII)Lii;",
            garbageValue = "1229700088"
    )
    public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
      Iterator var4 = this.details.values().iterator();

      WorldMapArea var5;
      do {
         if (!var4.hasNext()) {
            return null;
         }

         var5 = (WorldMapArea)var4.next();
      } while(!var5.containsCoord(var1, var2, var3));

      return var5;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(IIIZB)V",
      garbageValue = "60"
   )
   public void method2290(int var1, int var2, int var3, boolean var4) {
      WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3);
      if (var5 == null) {
         if (!var4) {
            return;
         }

         var5 = this.mainMapArea;
      }

      boolean var6 = false;
      if (var5 != this.field3873 || var4) {
         this.field3873 = var5;
         this.setCurrentMapArea(var5);
         var6 = true;
      }

      if (var6 || var4) {
         this.jump(var1, var2, var3);
      }

   }

    @ObfuscatedName("b")
    @ObfuscatedSignature(
            descriptor = "(II)V",
            garbageValue = "457504951"
    )
    public void setCurrentMapAreaId(int var1) {
      WorldMapArea var2 = this.getMapArea(var1);
      if (var2 != null) {
         this.setCurrentMapArea(var2);
      }

   }

    @ObfuscatedName("m")
    @ObfuscatedSignature(
            descriptor = "(I)I",
            garbageValue = "1557630063"
    )
    public int currentMapAreaId() {
      return this.currentMapArea == null ? -1 : this.currentMapArea.getId();
   }

    @ObfuscatedName("t")
    @ObfuscatedSignature(
            descriptor = "(I)Lii;",
            garbageValue = "-1507356521"
    )
    public WorldMapArea getCurrentMapArea() {
      return this.currentMapArea;
   }

    @ObfuscatedName("h")
    @ObfuscatedSignature(
            descriptor = "(Lii;B)V",
            garbageValue = "-52"
    )
    void setCurrentMapArea(WorldMapArea var1) {
      if (this.currentMapArea == null || var1 != this.currentMapArea) {
         this.initializeWorldMapManager(var1);
         this.jump(-1, -1, -1);
      }
   }

    @ObfuscatedName("p")
    @ObfuscatedSignature(
            descriptor = "(Lii;I)V",
            garbageValue = "-1465346013"
    )
    void initializeWorldMapManager(WorldMapArea var1) {
      this.currentMapArea = var1;
      this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive);
      this.cacheLoader.reset(this.currentMapArea.getInternalName());
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(Lii;Lko;Lko;ZI)V",
      garbageValue = "-1866070089"
   )
   public void method2287(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
      if (var1 != null) {
         if (this.currentMapArea == null || var1 != this.currentMapArea) {
            this.initializeWorldMapManager(var1);
         }

         if (!var4 && this.currentMapArea.containsCoord(var2.plane, var2.x, var2.y)) {
            this.jump(var2.plane, var2.x, var2.y);
         } else {
            this.jump(var3.plane, var3.x, var3.y);
         }

      }
   }

    @ObfuscatedName("u")
    @ObfuscatedSignature(
            descriptor = "(IIII)V",
            garbageValue = "919622634"
    )
    void jump(int var1, int var2, int var3) {
      if (this.currentMapArea != null) {
         int[] var4 = this.currentMapArea.position(var1, var2, var3);
         if (var4 == null) {
            var4 = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY());
         }

         this.setWorldMapPosition(var4[0] - this.currentMapArea.getRegionLowX() * 64, var4[1] - this.currentMapArea.getRegionLowY() * 64, true);
         this.worldMapTargetX = -1;
         this.worldMapTargetY = -1;
         this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom());
         this.zoomTarget = this.zoom;
         this.field3907 = null;
         this.iconIterator = null;
         this.worldMapManager.clearIcons();
      }
   }

    @ObfuscatedName("x")
    @ObfuscatedSignature(
            descriptor = "(IIIIIB)V",
            garbageValue = "-93"
    )
    public void draw(int var1, int var2, int var3, int var4, int var5) {
      int[] var6 = new int[4];
      Rasterizer2D.Rasterizer2D_getClipArray(var6);
      Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4);
      Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216);
      int var7 = this.cacheLoader.getPercentLoaded();
      if (var7 < 100) {
         this.drawLoading(var1, var2, var3, var4, var7);
      } else {
         if (!this.worldMapManager.isLoaded()) {
            this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld);
            if (!this.worldMapManager.isLoaded()) {
               return;
            }
         }

         if (this.flashingElements != null) {
            ++this.flashCycle;
            if (this.flashCycle % this.cyclesPerFlash == 0) {
               this.flashCycle = 0;
               ++this.flashCount;
            }

            if (this.flashCount >= this.maxFlashCount && !this.perpetualFlash) {
               this.flashingElements = null;
            }
         }

         int var8 = (int)Math.ceil((double)((float)var3 / this.zoom));
         int var9 = (int)Math.ceil((double)((float)var4 / this.zoom));
         AbstractWorldMapData.field2351 = Client.param25 >= 209;
         this.worldMapManager.drawTiles(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4);
         boolean var10;
         if (!this.elementsDisabled) {
            var10 = false;
            if (var5 - this.field3896 > 100) {
               this.field3896 = var5;
               var10 = true;
            }

            this.worldMapManager.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field3903, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10);
         }

         this.method2245(var1, var2, var3, var4, var8, var9);
         var10 = Client.staffModLevel >= 2;
         if (var10 && this.showCoord && this.mouseCoord != null) {
            this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
         }

         this.worldMapDisplayWidth = var8;
         this.worldMapDisplayHeight = var9;
         this.worldMapDisplayX = var1;
         this.worldMapDisplayY = var2;
         Rasterizer2D.Rasterizer2D_setClipArray(var6);
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IIIIIII)Z",
      garbageValue = "2017068327"
   )
   boolean method2244(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.sprite == null) {
         return true;
      } else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) {
         if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) {
            return true;
         } else if (this.field3914 != Client.field660) {
            return true;
         } else if (var3 <= 0 && var4 <= 0) {
            return var3 + var1 < var5 || var2 + var4 < var6;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(IIIIIII)V",
      garbageValue = "-1125583707"
   )
   void method2245(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (class136.field1293 != null) {
         int var7 = 512 / (this.worldMapManager.pixelsPerTile * 2);
         int var8 = var3 + 512;
         int var9 = var4 + 512;
         float var10 = 1.0F;
         var8 = (int)((float)var8 / var10);
         var9 = (int)((float)var9 / var10);
         int var11 = this.getDisplayX() - var5 / 2 - var7;
         int var12 = this.getDisplayY() - var6 / 2 - var7;
         int var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile;
         int var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY));
         if (this.method2244(var8, var9, var13, var14, var3, var4)) {
            if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) {
               Arrays.fill(this.sprite.pixels, 0);
            } else {
               this.sprite = new SpritePixels(var8, var9);
            }

            this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7;
            this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7;
            this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile;
            class136.field1293.method1870(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10);
            this.field3914 = Client.field660;
            var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile;
            var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY));
         }

         Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128);
         if (var10 == 1.0F) {
            this.sprite.method2526(var13, var14, 192);
         } else {
            this.sprite.method2512(var13, var14, (int)((float)var8 * var10), (int)((float)var9 * var10), 192);
         }
      }

   }

    @ObfuscatedName("d")
    @ObfuscatedSignature(
            descriptor = "(IIIIB)V",
            garbageValue = "47"
    )
    public void drawOverview(int var1, int var2, int var3, int var4) {
      if (this.cacheLoader.isLoaded()) {
         if (!this.worldMapManager.isLoaded()) {
            this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld);
            if (!this.worldMapManager.isLoaded()) {
               return;
            }
         }

         this.worldMapManager.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash);
      }
   }

    @ObfuscatedName("e")
    @ObfuscatedSignature(
            descriptor = "(IB)V",
            garbageValue = "-15"
    )
    public void setZoomPercentage(int var1) {
      this.zoomTarget = this.getZoomFromPercentage(var1);
   }

    @ObfuscatedName("g")
    @ObfuscatedSignature(
            descriptor = "(IIIIII)V",
            garbageValue = "-649934539"
    )
    void drawLoading(int var1, int var2, int var3, int var4, int var5) {
      byte var6 = 20;
      int var7 = var3 / 2 + var1;
      int var8 = var4 / 2 + var2 - 18 - var6;
      Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216);
      Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536);
      Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536);
      this.font.drawCentered("Loading...", var7, var6 + var8, -1, -1);
   }

    @ObfuscatedName("y")
    @ObfuscatedSignature(
            descriptor = "(II)F",
            garbageValue = "-961955181"
    )
    float getZoomFromPercentage(int var1) {
      if (var1 == 25) {
         return 1.0F;
      } else if (var1 == 37) {
         return 1.5F;
      } else if (var1 == 50) {
         return 2.0F;
      } else if (var1 == 75) {
         return 3.0F;
      } else {
         return var1 == 100 ? 4.0F : 8.0F;
      }
   }

    @ObfuscatedName("af")
    @ObfuscatedSignature(
            descriptor = "(I)I",
            garbageValue = "-1942588571"
    )
    public int getZoomLevel() {
      if (1.0D == (double)this.zoomTarget) {
         return 25;
      } else if ((double)this.zoomTarget == 1.5D) {
         return 37;
      } else if (2.0D == (double)this.zoomTarget) {
         return 50;
      } else if (3.0D == (double)this.zoomTarget) {
         return 75;
      } else {
         return 4.0D == (double)this.zoomTarget ? 100 : 200;
      }
   }

    @ObfuscatedName("aa")
    @ObfuscatedSignature(
            descriptor = "(I)V",
            garbageValue = "-2119000297"
    )
    public void loadCache() {
      this.cacheLoader.load();
   }

    @ObfuscatedName("ai")
    @ObfuscatedSignature(
            descriptor = "(B)Z",
            garbageValue = "7"
    )
    public boolean isCacheLoaded() {
      return this.cacheLoader.isLoaded();
   }

    @ObfuscatedName("ag")
    @ObfuscatedSignature(
            descriptor = "(II)Lii;",
            garbageValue = "-146016730"
    )
    public WorldMapArea getMapArea(int var1) {
      Iterator var2 = this.details.values().iterator();

      WorldMapArea var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (WorldMapArea)var2.next();
      } while(var3.getId() != var1);

      return var3;
   }

    @ObfuscatedName("aw")
    @ObfuscatedSignature(
            descriptor = "(IIB)V",
            garbageValue = "-68"
    )
    public void setWorldMapPositionTarget(int var1, int var2) {
      if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) {
         this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64;
         this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64;
      }
   }

    @ObfuscatedName("ar")
    @ObfuscatedSignature(
            descriptor = "(III)V",
            garbageValue = "2031555898"
    )
    public void setWorldMapPositionTargetInstant(int var1, int var2) {
      if (this.currentMapArea != null) {
         this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true);
         this.worldMapTargetX = -1;
         this.worldMapTargetY = -1;
      }
   }

    @ObfuscatedName("al")
    @ObfuscatedSignature(
            descriptor = "(IIIS)V",
            garbageValue = "-6727"
    )
    public void jumpToSourceCoord(int var1, int var2, int var3) {
      if (this.currentMapArea != null) {
         int[] var4 = this.currentMapArea.position(var1, var2, var3);
         if (var4 != null) {
            this.setWorldMapPositionTarget(var4[0], var4[1]);
         }

      }
   }

    @ObfuscatedName("at")
    @ObfuscatedSignature(
            descriptor = "(IIII)V",
            garbageValue = "1578409200"
    )
    public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
      if (this.currentMapArea != null) {
         int[] var4 = this.currentMapArea.position(var1, var2, var3);
         if (var4 != null) {
            this.setWorldMapPositionTargetInstant(var4[0], var4[1]);
         }

      }
   }

    @ObfuscatedName("aj")
    @ObfuscatedSignature(
            descriptor = "(I)I",
            garbageValue = "-1087726374"
    )
    public int getDisplayX() {
      return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64;
   }

    @ObfuscatedName("ax")
    @ObfuscatedSignature(
            descriptor = "(B)I",
            garbageValue = "-114"
    )
    public int getDisplayY() {
      return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64;
   }

    @ObfuscatedName("az")
    @ObfuscatedSignature(
            descriptor = "(B)Lko;",
            garbageValue = "0"
    )
    public Coord getDisplayCoord() {
      return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY());
   }

    @ObfuscatedName("ap")
    @ObfuscatedSignature(
            descriptor = "(I)I",
            garbageValue = "-1696300360"
    )
    public int getDisplayWith() {
      return this.worldMapDisplayWidth;
   }

    @ObfuscatedName("ay")
    @ObfuscatedSignature(
            descriptor = "(B)I",
            garbageValue = "-12"
    )
    public int getDisplayHeight() {
      return this.worldMapDisplayHeight;
   }

    @ObfuscatedName("ac")
    @ObfuscatedSignature(
            descriptor = "(II)V",
            garbageValue = "-1687867671"
    )
    public void setMaxFlashCount(int var1) {
      if (var1 >= 1) {
         this.maxFlashCount = var1;
      }

   }

    @ObfuscatedName("av")
    @ObfuscatedSignature(
            descriptor = "(I)V",
            garbageValue = "-269686963"
    )
    public void resetMaxFlashCount() {
      this.maxFlashCount = 3;
   }

    @ObfuscatedName("aq")
    @ObfuscatedSignature(
            descriptor = "(II)V",
            garbageValue = "468851874"
    )
    public void setCyclesPerFlash(int var1) {
      if (var1 >= 1) {
         this.cyclesPerFlash = var1;
      }

   }

    @ObfuscatedName("ak")
    @ObfuscatedSignature(
            descriptor = "(B)V",
            garbageValue = "-118"
    )
    public void resetCyclesPerFlash() {
      this.cyclesPerFlash = 50;
   }

    @ObfuscatedName("au")
    @ObfuscatedSignature(
            descriptor = "(ZI)V",
            garbageValue = "1156633968"
    )
    public void setPerpetualFlash(boolean var1) {
      this.perpetualFlash = var1;
   }

    @ObfuscatedName("ae")
    @ObfuscatedSignature(
            descriptor = "(IB)V",
            garbageValue = "11"
    )
    public void flashElement(int var1) {
      this.flashingElements = new HashSet();
      this.flashingElements.add(var1);
      this.flashCount = 0;
      this.flashCycle = 0;
   }

    @ObfuscatedName("ah")
    @ObfuscatedSignature(
            descriptor = "(II)V",
            garbageValue = "-1867265492"
    )
    public void flashCategory(int var1) {
      this.flashingElements = new HashSet();
      this.flashCount = 0;
      this.flashCycle = 0;

      for(int var2 = 0; var2 < class361.WorldMapElement_count; ++var2) {
         if (class4.WorldMapElement_get(var2) != null && class4.WorldMapElement_get(var2).category == var1) {
            this.flashingElements.add(class4.WorldMapElement_get(var2).objectId);
         }
      }

   }

    @ObfuscatedName("ad")
    @ObfuscatedSignature(
            descriptor = "(I)V",
            garbageValue = "-998180334"
    )
    public void stopCurrentFlashes() {
      this.flashingElements = null;
   }

    @ObfuscatedName("ab")
    @ObfuscatedSignature(
            descriptor = "(ZI)V",
            garbageValue = "-1449129322"
    )
    public void setElementsDisabled(boolean var1) {
      this.elementsDisabled = !var1;
   }

    @ObfuscatedName("an")
    @ObfuscatedSignature(
            descriptor = "(IZI)V",
            garbageValue = "1064049912"
    )
    public void disableElement(int var1, boolean var2) {
      if (!var2) {
         this.enabledElements.add(var1);
      } else {
         this.enabledElements.remove(var1);
      }

      this.method2271();
   }

    @ObfuscatedName("am")
    @ObfuscatedSignature(
            descriptor = "(IZS)V",
            garbageValue = "26480"
    )
    public void setCategoryDisabled(int var1, boolean var2) {
      if (!var2) {
         this.enabledCategories.add(var1);
      } else {
         this.enabledCategories.remove(var1);
      }

      for(int var3 = 0; var3 < class361.WorldMapElement_count; ++var3) {
         if (class4.WorldMapElement_get(var3) != null && class4.WorldMapElement_get(var3).category == var1) {
            int var4 = class4.WorldMapElement_get(var3).objectId;
            if (!var2) {
               this.enabledElementIds.add(var4);
            } else {
               this.enabledElementIds.remove(var4);
            }
         }
      }

      this.method2271();
   }

    @ObfuscatedName("as")
    @ObfuscatedSignature(
            descriptor = "(I)Z",
            garbageValue = "2073114555"
    )
    public boolean getElementsDisabled() {
      return !this.elementsDisabled;
   }

    @ObfuscatedName("ao")
    @ObfuscatedSignature(
            descriptor = "(II)Z",
            garbageValue = "-1249266830"
    )
    public boolean isElementDisabled(int var1) {
      return !this.enabledElements.contains(var1);
   }

    @ObfuscatedName("bj")
    @ObfuscatedSignature(
            descriptor = "(II)Z",
            garbageValue = "-1383476360"
    )
    public boolean isCategoryDisabled(int var1) {
      return !this.enabledCategories.contains(var1);
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "31"
   )
   void method2271() {
      this.field3903.clear();
      this.field3903.addAll(this.enabledElements);
      this.field3903.addAll(this.enabledElementIds);
   }

    @ObfuscatedName("bz")
    @ObfuscatedSignature(
            descriptor = "(IIIIIII)V",
            garbageValue = "51725757"
    )
    public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.cacheLoader.isLoaded()) {
         int var7 = (int)Math.ceil((double)((float)var3 / this.zoom));
         int var8 = (int)Math.ceil((double)((float)var4 / this.zoom));
         List var9 = this.worldMapManager.method1394(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6);
         if (!var9.isEmpty()) {
            Iterator var10 = var9.iterator();

            boolean var13;
            do {
               if (!var10.hasNext()) {
                  return;
               }

               AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next();
               WorldMapElement var12 = class4.WorldMapElement_get(var11.getElement());
               var13 = false;

               for(int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) {
                  if (var12.menuActions[var14] != null) {
                     WorldMapManager.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed());
                     var13 = true;
                  }
               }
            } while(!var13);

         }
      }
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(ILko;B)Lko;",
      garbageValue = "91"
   )
   public Coord method2234(int var1, Coord var2) {
      if (!this.cacheLoader.isLoaded()) {
         return null;
      } else if (!this.worldMapManager.isLoaded()) {
         return null;
      } else if (!this.currentMapArea.containsPosition(var2.x, var2.y)) {
         return null;
      } else {
         HashMap var3 = this.worldMapManager.buildIcons();
         List var4 = (List)var3.get(var1);
         if (var4 != null && !var4.isEmpty()) {
            AbstractWorldMapIcon var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();

            while(true) {
               AbstractWorldMapIcon var8;
               int var11;
               do {
                  if (!var7.hasNext()) {
                     return var5.coord2;
                  }

                  var8 = (AbstractWorldMapIcon)var7.next();
                  int var9 = var8.coord2.x - var2.x;
                  int var10 = var8.coord2.y - var2.y;
                  var11 = var9 * var9 + var10 * var10;
                  if (var11 == 0) {
                     return var8.coord2;
                  }
               } while(var11 >= var6 && var5 != null);

               var5 = var8;
               var6 = var11;
            }
         } else {
            return null;
         }
      }
   }

    @ObfuscatedName("bm")
    @ObfuscatedSignature(
            descriptor = "(IILko;Lko;I)V",
            garbageValue = "-1523313738"
    )
    public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
      ScriptEvent var5 = new ScriptEvent();
      WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4);
      var5.setArgs(new Object[]{var6});
      switch(var1) {
      case 1008:
         var5.setType(10);
         break;
      case 1009:
         var5.setType(11);
         break;
      case 1010:
         var5.setType(12);
         break;
      case 1011:
         var5.setType(13);
         break;
      case 1012:
         var5.setType(14);
      }

      WorldMapAreaData.runScriptEvent(var5);
   }

    @ObfuscatedName("be")
    @ObfuscatedSignature(
            descriptor = "(I)Lio;",
            garbageValue = "1232678817"
    )
    public AbstractWorldMapIcon iconStart() {
      if (!this.cacheLoader.isLoaded()) {
         return null;
      } else if (!this.worldMapManager.isLoaded()) {
         return null;
      } else {
         HashMap var1 = this.worldMapManager.buildIcons();
         this.field3907 = new LinkedList();
         Iterator var2 = var1.values().iterator();

         while(var2.hasNext()) {
            List var3 = (List)var2.next();
            this.field3907.addAll(var3);
         }

         this.iconIterator = this.field3907.iterator();
         return this.iconNext();
      }
   }

    @ObfuscatedName("bo")
    @ObfuscatedSignature(
            descriptor = "(I)Lio;",
            garbageValue = "-444518880"
    )
    public AbstractWorldMapIcon iconNext() {
      if (this.iconIterator == null) {
         return null;
      } else {
         AbstractWorldMapIcon var1;
         do {
            if (!this.iconIterator.hasNext()) {
               return null;
            }

            var1 = (AbstractWorldMapIcon)this.iconIterator.next();
         } while(var1.getElement() == -1);

         return var1;
      }
   }
}

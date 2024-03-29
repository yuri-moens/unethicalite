import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.Iterator;
import net.runelite.mapping.Export;
@ObfuscatedName("gx")
@Implements("ObjectComposition")
public class ObjectComposition extends DualNode {
	@ObfuscatedName("o")
	@Export("ObjectDefinition_isLowDetail")
	static boolean ObjectDefinition_isLowDetail = false;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("ObjectDefinition_archive")
	static AbstractArchive ObjectDefinition_archive;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("ObjectDefinition_modelsArchive")
	static AbstractArchive ObjectDefinition_modelsArchive;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("ObjectDefinition_cached")
	static EvictingDualNodeHashTable ObjectDefinition_cached = new EvictingDualNodeHashTable(4096);

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("ObjectDefinition_cachedModelData")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500);

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("ObjectDefinition_cachedEntities")
	static EvictingDualNodeHashTable ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(30);

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("ObjectDefinition_cachedModels")
	static EvictingDualNodeHashTable ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(30);

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "[Lgw;")
	static ModelData[] field2047 = new ModelData[4];

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 2136969511)
	@Export("id")
	public int id;

	@ObfuscatedName("a")
	@Export("modelIds")
	int[] modelIds;

	@ObfuscatedName("d")
	@Export("models")
	int[] models;

	@ObfuscatedName("n")
	@Export("name")
	public String name = "null";

	@ObfuscatedName("x")
	@Export("recolorFrom")
	short[] recolorFrom;

	@ObfuscatedName("g")
	@Export("recolorTo")
	short[] recolorTo;

	@ObfuscatedName("p")
	@Export("retextureFrom")
	short[] retextureFrom;

	@ObfuscatedName("b")
	@Export("retextureTo")
	short[] retextureTo;

	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 279187935)
	@Export("sizeX")
	public int sizeX = 1;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 95237359)
	@Export("sizeY")
	public int sizeY = 1;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = -559183263)
	@Export("interactType")
	public int interactType = 2;

	@ObfuscatedName("v")
	@Export("boolean1")
	public boolean boolean1 = true;

	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = -399419737)
	@Export("int1")
	public int int1 = -1;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = -869909921)
	@Export("clipType")
	int clipType = -1;

	@ObfuscatedName("s")
	@Export("nonFlatShading")
	boolean nonFlatShading = false;

	@ObfuscatedName("i")
	@Export("modelClipped")
	public boolean modelClipped = false;

	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = -1019636401)
	@Export("animationId")
	public int animationId = -1;

	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = -618733341)
	@Export("int2")
	public int int2 = 16;

	@ObfuscatedName("ag")
	@ObfuscatedGetter(intValue = 739412197)
	@Export("ambient")
	int ambient = 0;

	@ObfuscatedName("ar")
	@ObfuscatedGetter(intValue = -1565585471)
	@Export("contrast")
	int contrast = 0;

	@ObfuscatedName("aj")
	@Export("actions")
	public String[] actions = new String[5];

	@ObfuscatedName("au")
	@ObfuscatedGetter(intValue = 1574073177)
	@Export("mapIconId")
	public int mapIconId = -1;

	@ObfuscatedName("af")
	@ObfuscatedGetter(intValue = 378767969)
	@Export("mapSceneId")
	public int mapSceneId = -1;

	@ObfuscatedName("as")
	@Export("isRotated")
	boolean isRotated = false;

	@ObfuscatedName("ab")
	@Export("clipped")
	public boolean clipped = true;

	@ObfuscatedName("al")
	@ObfuscatedGetter(intValue = 916227379)
	@Export("modelSizeX")
	int modelSizeX = 128;

	@ObfuscatedName("ah")
	@ObfuscatedGetter(intValue = 431406989)
	@Export("modelHeight")
	int modelHeight = 128;

	@ObfuscatedName("ai")
	@ObfuscatedGetter(intValue = 988663065)
	@Export("modelSizeY")
	int modelSizeY = 128;

	@ObfuscatedName("ac")
	@ObfuscatedGetter(intValue = 389000797)
	@Export("offsetX")
	int offsetX = 0;

	@ObfuscatedName("ap")
	@ObfuscatedGetter(intValue = -1930878359)
	@Export("offsetHeight")
	int offsetHeight = 0;

	@ObfuscatedName("aw")
	@ObfuscatedGetter(intValue = 1227336601)
	@Export("offsetY")
	int offsetY = 0;

	@ObfuscatedName("at")
	@Export("boolean2")
	public boolean boolean2 = false;

	@ObfuscatedName("aq")
	@Export("isSolid")
	boolean isSolid = false;

	@ObfuscatedName("ax")
	@ObfuscatedGetter(intValue = -1292249553)
	@Export("int3")
	public int int3 = -1;

	@ObfuscatedName("an")
	@Export("transforms")
	public int[] transforms;

	@ObfuscatedName("aa")
	@ObfuscatedGetter(intValue = 1450002477)
	@Export("transformVarbit")
	int transformVarbit = -1;

	@ObfuscatedName("av")
	@ObfuscatedGetter(intValue = 745538225)
	@Export("transformVarp")
	int transformVarp = -1;

	@ObfuscatedName("ae")
	@ObfuscatedGetter(intValue = -1153062279)
	@Export("ambientSoundId")
	public int ambientSoundId = -1;

	@ObfuscatedName("ay")
	@ObfuscatedGetter(intValue = 1425821007)
	@Export("int7")
	public int int7 = 0;

	@ObfuscatedName("ak")
	@ObfuscatedGetter(intValue = -318102377)
	@Export("int5")
	public int int5 = 0;

	@ObfuscatedName("ao")
	@ObfuscatedGetter(intValue = 1378388001)
	@Export("int6")
	public int int6 = 0;

	@ObfuscatedName("am")
	@Export("soundEffectIds")
	public int[] soundEffectIds;

	@ObfuscatedName("ad")
	@Export("boolean3")
	public boolean boolean3 = true;

	@ObfuscatedName("az")
	@ObfuscatedSignature(descriptor = "Lpl;")
	@Export("params")
	IterableNodeHashTable params;

	ObjectComposition() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-663860162")
	@Export("postDecode")
	void postDecode() {
		if (this.int1 == -1) {
			this.int1 = 0;
			if (this.modelIds != null && (this.models == null || this.models[0] == 10)) {
				this.int1 = 1;
			}
			for (int var1 = 0; var1 < 5; ++var1) {
				if (this.actions[var1] != null) {
					this.int1 = 1;
				}
			}
		}
		if (this.int3 == -1) {
			this.int3 = (this.interactType != 0) ? 1 : 0;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Lqw;B)V", garbageValue = "1")
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}
			this.decodeNext(var1, var2);
		} 
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqw;II)V", garbageValue = "-1029923850")
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedByte();
			if (var3 > 0) {
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) {
					var1.offset += 3 * var3;
				} else {
					this.models = new int[var3];
					this.modelIds = new int[var3];
					for (var4 = 0; var4 < var3; ++var4) {
						this.modelIds[var4] = var1.readUnsignedShort();
						this.models[var4] = var1.readUnsignedByte();
					}
				}
			}
		} else if (var2 == 2) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 5) {
			var3 = var1.readUnsignedByte();
			if (var3 > 0) {
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) {
					var1.offset += 2 * var3;
				} else {
					this.models = null;
					this.modelIds = new int[var3];
					for (var4 = 0; var4 < var3; ++var4) {
						this.modelIds[var4] = var1.readUnsignedShort();
					}
				}
			}
		} else if (var2 == 14) {
			this.sizeX = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.sizeY = var1.readUnsignedByte();
		} else if (var2 == 17) {
			this.interactType = 0;
			this.boolean1 = false;
		} else if (var2 == 18) {
			this.boolean1 = false;
		} else if (var2 == 19) {
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 21) {
			this.clipType = 0;
		} else if (var2 == 22) {
			this.nonFlatShading = true;
		} else if (var2 == 23) {
			this.modelClipped = true;
		} else if (var2 == 24) {
			this.animationId = var1.readUnsignedShort();
			if (this.animationId == 65535) {
				this.animationId = -1;
			}
		} else if (var2 == 27) {
			this.interactType = 1;
		} else if (var2 == 28) {
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 29) {
			this.ambient = var1.readByte();
		} else if (var2 == 39) {
			this.contrast = var1.readByte() * 25;
		} else if (var2 >= 30 && var2 < 35) {
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated();
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) {
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) {
			var3 = var1.readUnsignedByte();
			this.recolorFrom = new short[var3];
			this.recolorTo = new short[var3];
			for (var4 = 0; var4 < var3; ++var4) {
				this.recolorFrom[var4] = ((short) (var1.readUnsignedShort()));
				this.recolorTo[var4] = ((short) (var1.readUnsignedShort()));
			}
		} else if (var2 == 41) {
			var3 = var1.readUnsignedByte();
			this.retextureFrom = new short[var3];
			this.retextureTo = new short[var3];
			for (var4 = 0; var4 < var3; ++var4) {
				this.retextureFrom[var4] = ((short) (var1.readUnsignedShort()));
				this.retextureTo[var4] = ((short) (var1.readUnsignedShort()));
			}
		} else if (var2 == 61) {
			var1.readUnsignedShort();
		} else if (var2 == 62) {
			this.isRotated = true;
		} else if (var2 == 64) {
			this.clipped = false;
		} else if (var2 == 65) {
			this.modelSizeX = var1.readUnsignedShort();
		} else if (var2 == 66) {
			this.modelHeight = var1.readUnsignedShort();
		} else if (var2 == 67) {
			this.modelSizeY = var1.readUnsignedShort();
		} else if (var2 == 68) {
			this.mapSceneId = var1.readUnsignedShort();
		} else if (var2 == 69) {
			var1.readUnsignedByte();
		} else if (var2 == 70) {
			this.offsetX = var1.readShort();
		} else if (var2 == 71) {
			this.offsetHeight = var1.readShort();
		} else if (var2 == 72) {
			this.offsetY = var1.readShort();
		} else if (var2 == 73) {
			this.boolean2 = true;
		} else if (var2 == 74) {
			this.isSolid = true;
		} else if (var2 == 75) {
			this.int3 = var1.readUnsignedByte();
		} else if (var2 != 77 && var2 != 92) {
			if (var2 == 78) {
				this.ambientSoundId = var1.readUnsignedShort();
				this.int7 = var1.readUnsignedByte();
			} else if (var2 == 79) {
				this.int5 = var1.readUnsignedShort();
				this.int6 = var1.readUnsignedShort();
				this.int7 = var1.readUnsignedByte();
				var3 = var1.readUnsignedByte();
				this.soundEffectIds = new int[var3];
				for (var4 = 0; var4 < var3; ++var4) {
					this.soundEffectIds[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 81) {
				this.clipType = var1.readUnsignedByte() * 256;
			} else if (var2 == 82) {
				this.mapIconId = var1.readUnsignedShort();
			} else if (var2 == 89) {
				this.boolean3 = false;
			} else if (var2 == 249) {
				this.params = class125.readStringIntParameters(var1, this.params);
			}
		} else {
			this.transformVarbit = var1.readUnsignedShort();
			if (this.transformVarbit == 65535) {
				this.transformVarbit = -1;
			}
			this.transformVarp = var1.readUnsignedShort();
			if (this.transformVarp == 65535) {
				this.transformVarp = -1;
			}
			var3 = -1;
			if (var2 == 92) {
				var3 = var1.readUnsignedShort();
				if (var3 == 65535) {
					var3 = -1;
				}
			}
			var4 = var1.readUnsignedByte();
			this.transforms = new int[var4 + 2];
			for (int var5 = 0; var5 <= var4; ++var5) {
				this.transforms[var5] = var1.readUnsignedShort();
				if (this.transforms[var5] == 65535) {
					this.transforms[var5] = -1;
				}
			}
			this.transforms[var4 + 1] = var3;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(IB)Z", garbageValue = "-80")
	public final boolean method3643(int var1) {
		if (this.models != null) {
			for (int var4 = 0; var4 < this.models.length; ++var4) {
				if (this.models[var4] == var1) {
					return ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var4] & '￿', 0);
				}
			}
			return true;
		} else if (this.modelIds == null) {
			return true;
		} else if (var1 != 10) {
			return true;
		} else {
			boolean var2 = true;
			for (int var3 = 0; var3 < this.modelIds.length; ++var3) {
				var2 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var3] & '￿', 0);
			}
			return var2;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "-27")
	@Export("needsModelFiles")
	public final boolean needsModelFiles() {
		if (this.modelIds == null) {
			return true;
		} else {
			boolean var1 = true;
			for (int var2 = 0; var2 < this.modelIds.length; ++var2) {
				var1 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var2] & '￿', 0);
			}
			return var1;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(II[[IIIII)Lgk;", garbageValue = "-1789537655")
	@Export("getEntity")
	public final Renderable getEntity(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) {
			var7 = ((long) (var2 + (this.id << 10)));
		} else {
			var7 = ((long) (var2 + (var1 << 3) + (this.id << 10)));
		}
		Object var9 = ((Renderable) (ObjectDefinition_cachedEntities.get(var7)));
		if (var9 == null) {
			ModelData var10 = this.getModelData(var1, var2);
			if (var10 == null) {
				return null;
			}
			if (!this.nonFlatShading) {
				var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			} else {
				var10.ambient = ((short) (this.ambient + 64));
				var10.contrast = ((short) (this.contrast + 768));
				var10.calculateVertexNormals();
				var9 = var10;
			}
			ObjectDefinition_cachedEntities.put(((DualNode) (var9)), var7);
		}
		if (this.nonFlatShading) {
			var9 = ((ModelData) (var9)).copyModelData();
		}
		if (this.clipType * 65536 >= 0) {
			if (var9 instanceof Model) {
				var9 = ((Model) (var9)).contourGround(var3, var4, var5, var6, true, this.clipType * 65536);
			} else if (var9 instanceof ModelData) {
				var9 = ((ModelData) (var9)).method3921(var3, var4, var5, var6, true, this.clipType * 65536);
			}
		}
		return ((Renderable) (var9));
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(II[[IIIII)Lhd;", garbageValue = "-1483762037")
	@Export("getModel")
	public final Model getModel(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) {
			var7 = ((long) (var2 + (this.id << 10)));
		} else {
			var7 = ((long) (var2 + (var1 << 3) + (this.id << 10)));
		}
		Model var9 = ((Model) (ObjectDefinition_cachedModels.get(var7)));
		if (var9 == null) {
			ModelData var10 = this.getModelData(var1, var2);
			if (var10 == null) {
				return null;
			}
			var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			ObjectDefinition_cachedModels.put(var9, var7);
		}
		if (this.clipType * 65536 >= 0) {
			var9 = var9.contourGround(var3, var4, var5, var6, true, this.clipType * 65536);
		}
		return var9;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(II[[IIIILgc;IS)Lhd;", garbageValue = "32767")
	@Export("getModelDynamic")
	public final Model getModelDynamic(int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceDefinition var7, int var8) {
		long var9;
		if (this.models == null) {
			var9 = ((long) (var2 + (this.id << 10)));
		} else {
			var9 = ((long) (var2 + (var1 << 3) + (this.id << 10)));
		}
		Model var11 = ((Model) (ObjectDefinition_cachedModels.get(var9)));
		if (var11 == null) {
			ModelData var12 = this.getModelData(var1, var2);
			if (var12 == null) {
				return null;
			}
			var11 = var12.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			ObjectDefinition_cachedModels.put(var11, var9);
		}
		if (var7 == null && this.clipType * 65536 == -1) {
			return var11;
		} else {
			if (var7 != null) {
				var11 = var7.transformObjectModel(var11, var8, var2);
			} else {
				var11 = var11.toSharedSequenceModel(true);
			}
			if (this.clipType * 65536 >= 0) {
				var11 = var11.contourGround(var3, var4, var5, var6, false, this.clipType * 65536);
			}
			return var11;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(IIB)Lgw;", garbageValue = "43")
	@Export("getModelData")
	final ModelData getModelData(int var1, int var2) {
		ModelData var3 = null;
		boolean var4;
		int var5;
		int var7;
		if (this.models == null) {
			if (var1 != 10) {
				return null;
			}
			if (this.modelIds == null) {
				return null;
			}
			var4 = this.isRotated;
			if (var1 == 2 && var2 > 3) {
				var4 = !var4;
			}
			var5 = this.modelIds.length;
			for (int var6 = 0; var6 < var5; ++var6) {
				var7 = this.modelIds[var6];
				if (var4) {
					var7 += 65536;
				}
				var3 = ((ModelData) (ObjectDefinition_cachedModelData.get(((long) (var7)))));
				if (var3 == null) {
					var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var7 & '￿', 0);
					if (var3 == null) {
						return null;
					}
					if (var4) {
						var3.method3930();
					}
					ObjectDefinition_cachedModelData.put(var3, ((long) (var7)));
				}
				if (var5 > 1) {
					field2047[var6] = var3;
				}
			}
			if (var5 > 1) {
				var3 = new ModelData(field2047, var5);
			}
		} else {
			int var9 = -1;
			for (var5 = 0; var5 < this.models.length; ++var5) {
				if (this.models[var5] == var1) {
					var9 = var5;
					break;
				}
			}
			if (var9 == -1) {
				return null;
			}
			var5 = this.modelIds[var9];
			boolean var10 = this.isRotated ^ var2 > 3;
			if (var10) {
				var5 += 65536;
			}
			var3 = ((ModelData) (ObjectDefinition_cachedModelData.get(((long) (var5)))));
			if (var3 == null) {
				var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var5 & '￿', 0);
				if (var3 == null) {
					return null;
				}
				if (var10) {
					var3.method3930();
				}
				ObjectDefinition_cachedModelData.put(var3, ((long) (var5)));
			}
		}
		if (this.modelSizeX == 128 && this.modelHeight == 128 && this.modelSizeY == 128) {
			var4 = false;
		} else {
			var4 = true;
		}
		boolean var11;
		if (this.offsetX == 0 && this.offsetHeight == 0 && this.offsetY == 0) {
			var11 = false;
		} else {
			var11 = true;
		}
		ModelData var8 = new ModelData(var3, var2 == 0 && !var4 && !var11, this.recolorFrom == null, null == this.retextureFrom, true);
		if (var1 == 4 && var2 > 3) {
			var8.method3947(256);
			var8.changeOffset(45, 0, -45);
		}
		var2 &= 3;
		if (var2 == 1) {
			var8.method3923();
		} else if (var2 == 2) {
			var8.method3924();
		} else if (var2 == 3) {
			var8.method3925();
		}
		if (this.recolorFrom != null) {
			for (var7 = 0; var7 < this.recolorFrom.length; ++var7) {
				var8.recolor(this.recolorFrom[var7], this.recolorTo[var7]);
			}
		}
		if (this.retextureFrom != null) {
			for (var7 = 0; var7 < this.retextureFrom.length; ++var7) {
				var8.retexture(this.retextureFrom[var7], this.retextureTo[var7]);
			}
		}
		if (var4) {
			var8.resize(this.modelSizeX, this.modelHeight, this.modelSizeY);
		}
		if (var11) {
			var8.changeOffset(this.offsetX, this.offsetHeight, this.offsetY);
		}
		return var8;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(B)Lgx;", garbageValue = "14")
	@Export("transform")
	public final ObjectComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class271.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}
		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}
		return var2 != -1 ? WorldMapDecoration.getObjectDefinition(var2) : null;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(III)I", garbageValue = "-1009286195")
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params;
		int var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			IntegerNode var5 = ((IntegerNode) (var4.get(((long) (var1)))));
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = var5.integer;
			}
		}
		return var3;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", garbageValue = "95361837")
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return Messages.method2575(this.params, var1, var2);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "2048965093")
	@Export("hasSound")
	public boolean hasSound() {
		if (this.transforms == null) {
			return this.ambientSoundId != -1 || this.soundEffectIds != null;
		} else {
			for (int var1 = 0; var1 < this.transforms.length; ++var1) {
				if (this.transforms[var1] != -1) {
					ObjectComposition var2 = WorldMapDecoration.getObjectDefinition(this.transforms[var1]);
					if (var2.ambientSoundId != -1 || var2.soundEffectIds != null) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "1")
	public static boolean method3699() {
		ReflectionCheck var0 = ((ReflectionCheck) (class33.reflectionChecks.last()));
		return var0 != null;
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1734425699")
	static final void method3698() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) {
			Player var1 = Client.players[Players.Players_indices[var0]];
			var1.clearIsFriend();
		}
		Iterator var2 = Messages.Messages_hashTable.iterator();
		while (var2.hasNext()) {
			Message var3 = ((Message) (var2.next()));
			var3.clearIsFromFriend();
		} 
		if (class13.friendsChat != null) {
			class13.friendsChat.clearFriends();
		}
	}
}
package com.epinephrine.conquestarmory.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.util.ResourceLocation;

import java.util.function.Function;

public class ChakramModel extends Model
{

    public ChakramModel(Function<ResourceLocation, RenderType> renderTypeIn) {
        super(renderTypeIn);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {

    }
}

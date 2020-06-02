package com.evep.evepmod.items.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelCloakHelmet - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelCloakHelmet extends ModelBiped {
    public ModelRenderer HoodBack;
    public ModelRenderer HoodTop;
    public ModelRenderer HoodRight;
    public ModelRenderer HoodFront;
    public ModelRenderer HoodBottom;
    public ModelRenderer HoodLeft;

    public ModelCloakHelmet() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.HoodBack = new ModelRenderer(this, 1, 20);
        this.HoodBack.setRotationPoint(-4.0F, -8.0F, 4.0F);
        this.HoodBack.addBox(0.0F, 0.0F, 0.0F, 8, 8, 1, 0.0F);
        this.HoodFront = new ModelRenderer(this, 1, 19);
        this.HoodFront.setRotationPoint(-4.0F, -8.0F, -4.5F);
        this.HoodFront.addBox(0.0F, 0.0F, 0.0F, 8, 2, 1, 0.0F);
        this.HoodLeft = new ModelRenderer(this, 19, 16);
        this.HoodLeft.setRotationPoint(-5.0F, -8.0F, -4.0F);
        this.HoodLeft.addBox(0.0F, 0.0F, 0.0F, 1, 8, 8, 0.0F);
        this.HoodTop = new ModelRenderer(this, 4, 114);
        this.HoodTop.setRotationPoint(-4.0F, -9.0F, -4.0F);
        this.HoodTop.addBox(0.0F, 0.0F, 0.0F, 8, 1, 8, 0.0F);
        this.HoodRight = new ModelRenderer(this, 19, 16);
        this.HoodRight.mirror = true;
        this.HoodRight.setRotationPoint(4.0F, -8.0F, -4.0F);
        this.HoodRight.addBox(0.0F, 0.0F, 0.0F, 1, 8, 8, 0.0F);
        this.HoodBottom = new ModelRenderer(this, 6, 21);
        this.HoodBottom.setRotationPoint(-4.0F, 0.0F, 2.0F);
        this.HoodBottom.addBox(0.0F, 0.0F, 0.0F, 8, 1, 2, 0.0F);
        
        this.bipedHead.addChild(HoodBack);
        this.bipedHead.addChild(HoodTop);
        this.bipedHead.addChild(HoodRight);
        this.bipedHead.addChild(HoodFront);
        this.bipedHead.addChild(HoodBottom);
        this.bipedHead.addChild(HoodLeft);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	super.render(entity, f, f1, f2, f3, f4, f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

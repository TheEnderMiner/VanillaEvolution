package com.evep.evepmod.items.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelEnderOverlordHelmet - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelEarthChestplate extends ModelBiped {
    public ModelRenderer Chestplate;
    public ModelRenderer LeftShoulder;
    public ModelRenderer RightShoulder;
    public ModelRenderer RightArm;

    public ModelEarthChestplate() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        
        this.RightShoulder = new ModelRenderer(this, 90, 40);
        this.RightShoulder.setRotationPoint(-0.5F, -2.5F, -1.0F);
        this.RightShoulder.addBox(-3.0F, 0.0F, -2.0F, 6, 5, 6, 0.0F);
        
        this.RightArm = new ModelRenderer(this, 90, 40);
        this.RightArm.setRotationPoint(-0.1F, 2.5F, -0.5F);
        this.RightArm.addBox(-3.0F, 0.0F, -2.0F, 5, 7, 5, 0.0F);
        
        this.Chestplate = new ModelRenderer(this, 90, 10);
        this.Chestplate.setRotationPoint(-0.5F, -0.5F, -0.5F);
        this.Chestplate.addBox(-4.0F, 0.0F, -2.0F, 9, 13, 5, 0.0F);
        
        this.LeftShoulder = new ModelRenderer(this, 90, 40);
        this.LeftShoulder.setRotationPoint(-1.0F, -0.5F, -1.0F);
        this.LeftShoulder.addBox(-1.0F, -2.0F, -2.0F, 6, 5, 6, 0.0F);
        
        this.bipedBody.addChild(Chestplate);
        this.bipedLeftArm.addChild(LeftShoulder);
        this.bipedRightArm.addChild(RightShoulder);
        this.bipedRightArm.addChild(RightArm);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	super.render(entity, f, f1, f2, f3, f4, f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

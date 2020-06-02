package com.evep.evepmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * ModelZombie - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelImmjiriChampion extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer LeftHead;
    public ModelRenderer RightLeg;
    public ModelRenderer RightArm;
    public ModelRenderer LeftArm;
    public ModelRenderer LeftLeg;
    public ModelRenderer RightHead;

    public ModelImmjiriChampion() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.LeftHead = new ModelRenderer(this, 0, 0);
        this.LeftHead.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.LeftHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.RightLeg = new ModelRenderer(this, 0, 16);
        this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.1F);
        this.RightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.LeftArm = new ModelRenderer(this, 40, 16);
        this.LeftArm.mirror = true;
        this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.LeftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(LeftArm, -1.3962634015954636F, 0.10000736613927509F, -0.10000736613927509F);
        this.LeftLeg = new ModelRenderer(this, 0, 16);
        this.LeftLeg.mirror = true;
        this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.1F);
        this.LeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.Body = new ModelRenderer(this, 16, 16);
        this.Body.setRotationPoint(0.0F, -14.3F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.RightArm = new ModelRenderer(this, 40, 16);
        this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.RightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(RightArm, -1.3962634015954636F, -0.10000736613927509F, 0.10000736613927509F);
        this.RightHead = new ModelRenderer(this, 0, 0);
        this.RightHead.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.RightHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.Body.addChild(this.LeftHead);
        this.Body.addChild(this.RightLeg);
        this.Body.addChild(this.LeftArm);
        this.Body.addChild(this.LeftLeg);
        this.Body.addChild(this.RightArm);
        this.Body.addChild(this.RightHead);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Body.offsetX, this.Body.offsetY, this.Body.offsetZ);
        GlStateManager.translate(this.Body.rotationPointX * f5, this.Body.rotationPointY * f5, this.Body.rotationPointZ * f5);
        GlStateManager.scale(1.6D, 1.6D, 1.6D);
        GlStateManager.translate(-this.Body.offsetX, -this.Body.offsetY, -this.Body.offsetZ);
        GlStateManager.translate(-this.Body.rotationPointX * f5, -this.Body.rotationPointY * f5, -this.Body.rotationPointZ * f5);
        this.Body.render(f5);
        GlStateManager.popMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
    	this.LeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	
    	this.LeftHead.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.LeftHead.rotateAngleX = headPitch * 0.017453292F;
    	this.RightHead.rotateAngleY = netHeadYaw * 0.017853292F;
    	this.RightHead.rotateAngleX = headPitch * 0.017853292F;
    }
}

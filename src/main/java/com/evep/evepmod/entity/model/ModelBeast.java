package com.evep.evepmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelBeast extends ModelBase {
    public ModelRenderer RightArm;
    public ModelRenderer LeftLeg;
    public ModelRenderer Head;
    public ModelRenderer RightLeg;
    public ModelRenderer LeftArm;
    public ModelRenderer Body;
    public ModelRenderer HammerRod;
    public ModelRenderer HammerHead;
    public ModelRenderer Gem;

    public ModelBeast() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.RightLeg = new ModelRenderer(this, 0, 16);
        this.RightLeg.setRotationPoint(-1.899999976158142F, 12.0F, 0.10000000149011612F);
        this.RightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.LeftArm = new ModelRenderer(this, 40, 16);
        this.LeftArm.mirror = true;
        this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.LeftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(LeftArm, -1.3962633609771726F, 0.10000736266374587F, -0.10000736266374587F);
        this.Body = new ModelRenderer(this, 16, 16);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.HammerHead = new ModelRenderer(this, 21, 51);
        this.HammerHead.setRotationPoint(-2.0F, -4.0F, -3.0F);
        this.HammerHead.addBox(0.0F, 0.0F, 0.0F, 6, 4, 8, 0.0F);
        this.Gem = new ModelRenderer(this, 37, 40);
        this.Gem.setRotationPoint(-2.0F, 2.0F, -3.0F);
        this.Gem.addBox(0.0F, 0.0F, 0.0F, 4, 4, 1, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.HammerRod = new ModelRenderer(this, 0, 53);
        this.HammerRod.setRotationPoint(-2.0F, 13.0F, -5.0F);
        this.HammerRod.addBox(0.0F, 0.0F, 0.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(HammerRod, 1.8212510744560826F, 0.0F, 0.0F);
        this.RightArm = new ModelRenderer(this, 40, 16);
        this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.RightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(RightArm, -1.3962633609771726F, -0.10000736266374587F, 0.10000736266374587F);
        this.LeftLeg = new ModelRenderer(this, 0, 16);
        this.LeftLeg.mirror = true;
        this.LeftLeg.setRotationPoint(1.899999976158142F, 12.0F, 0.10000000149011612F);
        this.LeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.HammerRod.addChild(this.HammerHead);
        this.Body.addChild(this.Gem);
        this.RightArm.addChild(this.HammerRod);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.RightLeg.render(f5);
        this.LeftArm.render(f5);
        this.Body.render(f5);
        this.Head.render(f5);
        this.RightArm.render(f5);
        this.LeftLeg.render(f5);
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
    	
    	this.Head.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.Head.rotateAngleX = headPitch * 0.017453292F;
    }
}

package com.evep.evepmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelLizard extends ModelBase {
    public ModelRenderer FrontLeftLeg;
    public ModelRenderer FrontBody;
    public ModelRenderer BackBody;
    public ModelRenderer BackLeftLeg;
    public ModelRenderer BackRightLeg;
    public ModelRenderer FrontRightLeg;
    public ModelRenderer Tail;
    public ModelRenderer Head;
    public ModelRenderer Nose;
    public ModelRenderer Tail2;

    public ModelLizard() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Tail = new ModelRenderer(this, 30, 15);
        this.Tail.setRotationPoint(-1.0F, 17.0F, 8.0F);
        this.Tail.addBox(0.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(Tail, 1.5707963267948966F, 0.0F, 0.0F);
        this.BackLeftLeg = new ModelRenderer(this, 0, 18);
        this.BackLeftLeg.setRotationPoint(0.5F, 20.0F, 7.0F);
        this.BackLeftLeg.addBox(0.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.FrontBody = new ModelRenderer(this, 21, 0);
        this.FrontBody.setRotationPoint(-1.0F, 18.0F, -3.0F);
        this.FrontBody.addBox(-3.0F, -3.0F, -3.0F, 8, 6, 7, 0.0F);
        this.setRotateAngle(FrontBody, 1.5707963267948966F, 0.0F, 0.0F);
        this.Nose = new ModelRenderer(this, 0, 10);
        this.Nose.setRotationPoint(-1.0F, 17.5F, -6.0F);
        this.Nose.addBox(-0.5F, 0.0F, -5.0F, 3, 3, 2, 0.0F);
        this.Tail2 = new ModelRenderer(this, 30, 15);
        this.Tail2.setRotationPoint(-1.0F, 16.9F, 13.3F);
        this.Tail2.addBox(0.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(Tail2, 1.1838568316277536F, 0.0F, 0.0F);
        this.FrontLeftLeg = new ModelRenderer(this, 0, 18);
        this.FrontLeftLeg.setRotationPoint(0.5F, 20.0F, -4.0F);
        this.FrontLeftLeg.addBox(0.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.BackRightLeg = new ModelRenderer(this, 0, 18);
        this.BackRightLeg.setRotationPoint(-2.5F, 20.0F, 7.0F);
        this.BackRightLeg.addBox(0.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.FrontRightLeg = new ModelRenderer(this, 0, 18);
        this.FrontRightLeg.setRotationPoint(-2.5F, 20.0F, -4.0F);
        this.FrontRightLeg.addBox(0.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.BackBody = new ModelRenderer(this, 18, 14);
        this.BackBody.setRotationPoint(0.0F, 18.0F, 2.0F);
        this.BackBody.addBox(-3.0F, -2.0F, -3.0F, 6, 9, 6, 0.0F);
        this.setRotateAngle(BackBody, 1.5707963267948966F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(-1.0F, 17.5F, -7.0F);
        this.Head.addBox(-2.0F, -3.0F, -2.0F, 6, 6, 4, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Tail.render(f5);
        this.BackLeftLeg.render(f5);
        this.FrontBody.render(f5);
        this.Nose.render(f5);
        this.Tail2.render(f5);
        this.FrontLeftLeg.render(f5);
        this.BackRightLeg.render(f5);
        this.FrontRightLeg.render(f5);
        this.BackBody.render(f5);
        this.Head.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
    	this.FrontLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.BackLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.FrontRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.BackRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	
    	this.Head.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.Head.rotateAngleX = headPitch * 0.017453292F;
    	this.Nose.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.Nose.rotateAngleX = headPitch * 0.017453292F;
    }
}

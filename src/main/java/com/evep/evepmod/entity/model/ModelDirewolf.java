package com.evep.evepmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelWolf - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelDirewolf extends ModelBase {
    public ModelRenderer FrontLeftLeg;
    public ModelRenderer MainBody;
    public ModelRenderer BackBody;
    public ModelRenderer BackLeftLeg;
    public ModelRenderer BackRightEar;
    public ModelRenderer FrontRightEar;
    public ModelRenderer tail;
    public ModelRenderer Head;
    public ModelRenderer RightEar;
    public ModelRenderer LeftEar;
    public ModelRenderer Nose;

    public ModelDirewolf() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.RightEar = new ModelRenderer(this, 16, 14);
        this.RightEar.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightEar.addBox(-2.0F, -5.0F, 0.0F, 2, 2, 1, 0.0F);
        this.BackRightEar = new ModelRenderer(this, 0, 18);
        this.BackRightEar.setRotationPoint(-2.5F, 16.0F, 7.0F);
        this.BackRightEar.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.tail = new ModelRenderer(this, 9, 18);
        this.tail.setRotationPoint(-1.0F, 12.0F, 8.0F);
        this.tail.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(tail, 1.0471975511965976F, 0.0F, 0.0F);
        this.BackLeftLeg = new ModelRenderer(this, 0, 18);
        this.BackLeftLeg.setRotationPoint(0.5F, 16.0F, 7.0F);
        this.BackLeftLeg.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.FrontRightEar = new ModelRenderer(this, 0, 18);
        this.FrontRightEar.setRotationPoint(-2.5F, 16.0F, -4.0F);
        this.FrontRightEar.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.Nose = new ModelRenderer(this, 0, 10);
        this.Nose.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Nose.addBox(-0.5F, 0.0F, -5.0F, 3, 3, 4, 0.0F);
        this.LeftEar = new ModelRenderer(this, 16, 14);
        this.LeftEar.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftEar.addBox(2.0F, -5.0F, 0.0F, 2, 2, 1, 0.0F);
        this.FrontLeftLeg = new ModelRenderer(this, 0, 18);
        this.FrontLeftLeg.setRotationPoint(0.5F, 16.0F, -4.0F);
        this.FrontLeftLeg.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.BackBody = new ModelRenderer(this, 18, 14);
        this.BackBody.setRotationPoint(0.0F, 14.0F, 2.0F);
        this.BackBody.addBox(-3.0F, -2.0F, -3.0F, 6, 9, 6, 0.0F);
        this.setRotateAngle(BackBody, 1.5707963267948966F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(-1.0F, 13.5F, -7.0F);
        this.Head.addBox(-2.0F, -3.0F, -2.0F, 6, 6, 4, 0.0F);
        this.MainBody = new ModelRenderer(this, 21, 0);
        this.MainBody.setRotationPoint(-1.0F, 14.0F, -3.0F);
        this.MainBody.addBox(-3.0F, -3.0F, -3.0F, 8, 6, 7, 0.0F);
        this.setRotateAngle(MainBody, 1.5707963267948966F, 0.0F, 0.0F);
        
        this.Head.addChild(this.LeftEar);
        this.Head.addChild(this.RightEar);
        this.Head.addChild(this.Nose);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    //    this.RightEar.render(f5);
        this.BackRightEar.render(f5);
        this.tail.render(f5);
        this.BackLeftLeg.render(f5);
        this.FrontRightEar.render(f5);
   //     this.Nose.render(f5);
   //     this.LeftEar.render(f5);
        this.FrontLeftLeg.render(f5);
        this.BackBody.render(f5);
        this.Head.render(f5);
        this.MainBody.render(f5);
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
    	this.BackLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.FrontLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.FrontRightEar.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.BackRightEar.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	
    	this.Head.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.Head.rotateAngleX = headPitch * 0.017453292F;
    }
}

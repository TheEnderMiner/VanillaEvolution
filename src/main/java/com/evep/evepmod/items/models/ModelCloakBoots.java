package com.evep.evepmod.items.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelCloakBoots - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelCloakBoots extends ModelBiped {
    public ModelRenderer LeftBootFront;
    public ModelRenderer RightBootFront;
    public ModelRenderer RightBootBack;
    public ModelRenderer LeftBootBack;
    public ModelRenderer LeftBootLeft;
    public ModelRenderer LeftBootRight;
    public ModelRenderer LeftBootBottom;
    public ModelRenderer RightBootBottom;
    public ModelRenderer RightBootRight;
    public ModelRenderer RightBootLeft;

    public ModelCloakBoots() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        
        //Left -2, Right +2
        this.RightBootLeft = new ModelRenderer(this, 14, 17);
        this.RightBootLeft.setRotationPoint(1.8F, 9.0F, -2.0F);
        this.RightBootLeft.addBox(0.0F, 0.0F, 0.0F, 1, 3, 4, 0.0F);
        
        this.LeftBootLeft = new ModelRenderer(this, 19, 23);
        this.LeftBootLeft.setRotationPoint(2.0F, 9.0F, -2.0F);
        this.LeftBootLeft.addBox(0.0F, 0.0F, 0.0F, 1, 3, 4, 0.0F);
        
        this.LeftBootRight = new ModelRenderer(this, 4, 17);
        this.LeftBootRight.setRotationPoint(-2.2F, 9.0F, -2.0F);
        this.LeftBootRight.addBox(0.0F, 0.0F, 0.0F, 1, 3, 4, 0.0F);
        
        this.RightBootBottom = new ModelRenderer(this, 14, 20);
        this.RightBootBottom.setRotationPoint(-2.0F, 12.0F, -2.0F);
        this.RightBootBottom.addBox(0.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F);
        
        this.LeftBootFront = new ModelRenderer(this, 18, 16);
        this.LeftBootFront.setRotationPoint(-2.0F, 9.0F, -3.0F);
        this.LeftBootFront.addBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F);
        
        this.LeftBootBack = new ModelRenderer(this, 25, 19);
        this.LeftBootBack.setRotationPoint(-2.0F, 9.0F, 2.0F);
        this.LeftBootBack.addBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F);
        
        this.RightBootFront = new ModelRenderer(this, 18, 17);
        this.RightBootFront.setRotationPoint(-2.0F, 9.0F, -3.0F);
        this.RightBootFront.addBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F);
        
        this.RightBootRight = new ModelRenderer(this, 16, 20);
        this.RightBootRight.setRotationPoint(-3.0F, 9.0F, -2.0F);
        this.RightBootRight.addBox(0.0F, 0.0F, 0.0F, 1, 3, 4, 0.0F);
        
        this.LeftBootBottom = new ModelRenderer(this, 20, 18);
        this.LeftBootBottom.setRotationPoint(-2.0F, 12.0F, -2.0F);
        this.LeftBootBottom.addBox(0.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F);
        
        this.RightBootBack = new ModelRenderer(this, 1, 20);
        this.RightBootBack.setRotationPoint(-2.0F, 9.0F, 2.0F);
        this.RightBootBack.addBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F);
        
        this.bipedLeftLeg.addChild(LeftBootFront);
        this.bipedLeftLeg.addChild(LeftBootBack);
        this.bipedLeftLeg.addChild(LeftBootLeft);
        this.bipedLeftLeg.addChild(LeftBootRight);
        this.bipedLeftLeg.addChild(LeftBootBottom);
        this.bipedRightLeg.addChild(RightBootFront);
        this.bipedRightLeg.addChild(RightBootBack);
        this.bipedRightLeg.addChild(RightBootBottom);
        this.bipedRightLeg.addChild(RightBootRight);
        this.bipedRightLeg.addChild(RightBootLeft);
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

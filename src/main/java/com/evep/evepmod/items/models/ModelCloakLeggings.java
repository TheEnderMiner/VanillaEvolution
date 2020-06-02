package com.evep.evepmod.items.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelCloakLeggings - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelCloakLeggings extends ModelBiped {
    public ModelRenderer LeftLegFront;
    public ModelRenderer LeftLegBack;
    public ModelRenderer LeftLegLeft;
    public ModelRenderer LeftLegRight;
    public ModelRenderer RightLegFront;
    public ModelRenderer RightLegBack;
    public ModelRenderer RightLegLeft;
    public ModelRenderer RightLegRight;

    public ModelCloakLeggings() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        
        //Left -2, Right +2
        this.RightLegRight = new ModelRenderer(this, 49, 19);
        this.RightLegRight.setRotationPoint(-3.0F, 0.0F, -2.0F);
        this.RightLegRight.addBox(0.0F, 0.0F, 0.0F, 1, 9, 4, 0.0F);
        
        this.RightLegFront = new ModelRenderer(this, 50, 20);
        this.RightLegFront.setRotationPoint(-2.0F, 0.0F, -3.0F);
        this.RightLegFront.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1, 0.0F);
        
        this.RightLegBack = new ModelRenderer(this, 53, 21);
        this.RightLegBack.setRotationPoint(-2.0F, 0.0F, 2.0F);
        this.RightLegBack.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1, 0.0F);
        
        this.LeftLegFront = new ModelRenderer(this, 45, 21);
        this.LeftLegFront.setRotationPoint(-2.0F, 0.0F, -3.0F);
        this.LeftLegFront.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1, 0.0F);
        
        this.LeftLegBack = new ModelRenderer(this, 46, 21);
        this.LeftLegBack.setRotationPoint(-2.0F, 0.0F, 2.0F);
        this.LeftLegBack.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1, 0.0F);
        
        this.LeftLegRight = new ModelRenderer(this, 50, 19);
        this.LeftLegRight.setRotationPoint(-2.2F, 0.0F, -2.0F);
        this.LeftLegRight.addBox(0.0F, 0.0F, 0.0F, 1, 9, 4, 0.0F);
        
        this.RightLegLeft = new ModelRenderer(this, 48, 19);
        this.RightLegLeft.setRotationPoint(1.8F, 0.0F, -2.0F);
        this.RightLegLeft.addBox(0.0F, 0.0F, 0.0F, 1, 9, 4, 0.0F);
        
        this.LeftLegLeft = new ModelRenderer(this, 48, 19);
        this.LeftLegLeft.setRotationPoint(2.0F, 0.0F, -2.0F);
        this.LeftLegLeft.addBox(0.0F, 0.0F, 0.0F, 1, 9, 4, 0.0F);
        
        this.bipedLeftLeg.addChild(LeftLegFront);
        this.bipedLeftLeg.addChild(LeftLegBack);
        this.bipedLeftLeg.addChild(LeftLegLeft);
        this.bipedLeftLeg.addChild(LeftLegRight);
        this.bipedRightLeg.addChild(RightLegFront);
        this.bipedRightLeg.addChild(RightLegBack);
        this.bipedRightLeg.addChild(RightLegLeft);
        this.bipedRightLeg.addChild(RightLegRight);
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

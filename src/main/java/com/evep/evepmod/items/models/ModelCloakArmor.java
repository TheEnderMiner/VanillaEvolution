package com.evep.evepmod.items.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;


public class ModelCloakArmor extends ModelBiped {
    public ModelRenderer HoodBack;
    public ModelRenderer HoodTop;
    public ModelRenderer HoodRight;
    public ModelRenderer HoodFront;
    public ModelRenderer HoodBottom;
    public ModelRenderer CloakBack;
    public ModelRenderer CloakLeftFlap;
    public ModelRenderer CloakRightFlap;
    public ModelRenderer CloakLeftFlapSmall;
    public ModelRenderer CloakRightFlapSmall;
    public ModelRenderer CloakFront;
    public ModelRenderer CloakLeft;
    public ModelRenderer CloakRight;
    public ModelRenderer CloakLeftArmTop;
    public ModelRenderer CloakLeftArmFront;
    public ModelRenderer CloakLeftArmBack;
    public ModelRenderer CloakLeftArmLeft;
    public ModelRenderer CloakLeftArmRight;
    public ModelRenderer CloakRightArmTop;
    public ModelRenderer CloakRightArmFront;
    public ModelRenderer CloakRightArmBack;
    public ModelRenderer CloakRightArmLeft;
    public ModelRenderer CloakRightArmRight;
    public ModelRenderer LeftLegFront;
    public ModelRenderer LeftLegBack;
    public ModelRenderer LeftLegLeft;
    public ModelRenderer LeftLegRight;
    public ModelRenderer RightLegFront;
    public ModelRenderer RightLegBack;
    public ModelRenderer RightLegLeft;
    public ModelRenderer RightLegRight;
    public ModelRenderer LeftBootFront;
    public ModelRenderer LeftBootBack;
    public ModelRenderer LeftBootLeft;
    public ModelRenderer LeftBootRight;
    public ModelRenderer RightBootFront;
    public ModelRenderer RightBootBack;
    public ModelRenderer RightBootLeft;
    public ModelRenderer RightBootRight;
    public ModelRenderer RightBootBottom;
    public ModelRenderer LeftBootBottom;
    public ModelRenderer HoodLeft;

    public ModelCloakArmor() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        
        //Head
        this.HoodRight = new ModelRenderer(this, 100, 97);
        this.HoodRight.setRotationPoint(4.0F, -8.0F, -4.0F);
        this.HoodRight.addBox(0.0F, 0.0F, 0.0F, 1, 8, 8, 0.0F);
        
        this.HoodBottom = new ModelRenderer(this, 100, 97);
        this.HoodBottom.setRotationPoint(-4.0F, 0.0F, 2.0F);
        this.HoodBottom.addBox(0.0F, 0.0F, 0.0F, 8, 1, 2, 0.0F);
        
        this.HoodFront = new ModelRenderer(this, 100, 97);
        this.HoodFront.setRotationPoint(-4.0F, -8.0F, -4.5F);
        this.HoodFront.addBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
        
        this.HoodLeft = new ModelRenderer(this, 100, 97);
        this.HoodLeft.setRotationPoint(-5.0F, -8.0F, -4.0F);
        this.HoodLeft.addBox(0.0F, 0.0F, 0.0F, 1, 8, 8, 0.0F);
        
        this.HoodTop = new ModelRenderer(this, 100, 97);
        this.HoodTop.setRotationPoint(-4.0F, -9.0F, -4.0F);
        this.HoodTop.addBox(0.0F, 0.0F, 0.0F, 8, 1, 8, 0.0F);
        
        this.HoodBack = new ModelRenderer(this, 100, 97);
        this.HoodBack.setRotationPoint(-4.0F, -8.0F, 4.0F);
        this.HoodBack.addBox(0.0F, 0.0F, 0.0F, 8, 8, 1, 0.0F);
        
        //Body
        this.CloakRightFlap = new ModelRenderer(this, 10, 100);
        this.CloakRightFlap.setRotationPoint(-4.0F, 0.0F, -3.0F);
        this.CloakRightFlap.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        
        this.CloakRightArmTop = new ModelRenderer(this, 10, 100);
        this.CloakRightArmTop.setRotationPoint(-8.0F, -1.0F, -2.0F);
        this.CloakRightArmTop.addBox(0.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F);
        
        this.CloakLeftArmRight = new ModelRenderer(this, 10, 100);
        this.CloakLeftArmRight.setRotationPoint(3.8F, 0.0F, -2.0F);
        this.CloakLeftArmRight.addBox(0.0F, 0.0F, 0.0F, 1, 11, 4, 0.0F);
        
        this.CloakLeftArmTop = new ModelRenderer(this, 10, 100);
        this.CloakLeftArmTop.setRotationPoint(4.0F, -1.0F, -2.0F);
        this.CloakLeftArmTop.addBox(0.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F);
        
        this.CloakRightArmBack = new ModelRenderer(this, 10, 100);
        this.CloakRightArmBack.setRotationPoint(-8.0F, 0.0F, 2.0F);
        this.CloakRightArmBack.addBox(0.0F, 0.0F, 0.0F, 4, 11, 1, 0.0F);
        
        this.CloakLeft = new ModelRenderer(this, 10, 100);
        this.CloakLeft.setRotationPoint(3.2F, 0.0F, -2.0F);
        this.CloakLeft.addBox(0.0F, 0.0F, 0.0F, 1, 13, 4, 0.0F);
        
        this.CloakLeftArmLeft = new ModelRenderer(this, 10, 100);
        this.CloakLeftArmLeft.setRotationPoint(8.0F, 0.0F, -2.0F);
        this.CloakLeftArmLeft.addBox(0.0F, 0.0F, 0.0F, 1, 11, 4, 0.0F);
        
        this.CloakLeftFlap = new ModelRenderer(this, 10, 100);
        this.CloakLeftFlap.setRotationPoint(2.0F, 0.0F, -3.0F);
        this.CloakLeftFlap.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        
        this.CloakLeftArmFront = new ModelRenderer(this, 10, 100);
        this.CloakLeftArmFront.setRotationPoint(4.0F, 0.0F, -3.0F);
        this.CloakLeftArmFront.addBox(0.0F, 0.0F, 0.0F, 4, 11, 1, 0.0F);
        
        this.CloakLeftFlapSmall = new ModelRenderer(this, 10, 100);
        this.CloakLeftFlapSmall.setRotationPoint(1.0F, 1.0F, -3.0F);
        this.CloakLeftFlapSmall.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        
        this.CloakRightFlapSmall = new ModelRenderer(this, 10, 100);
        this.CloakRightFlapSmall.setRotationPoint(-2.0F, 1.0F, -3.0F);
        this.CloakRightFlapSmall.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        
        this.CloakBack = new ModelRenderer(this, 10, 100);
        this.CloakBack.setRotationPoint(-4.0F, 0.0F, 2.0F);
        this.CloakBack.addBox(0.0F, 0.0F, 0.0F, 8, 13, 1, 0.0F);
        
        this.CloakLeftArmBack = new ModelRenderer(this, 10, 100);
        this.CloakLeftArmBack.setRotationPoint(4.0F, 0.0F, 2.0F);
        this.CloakLeftArmBack.addBox(0.0F, 0.0F, 0.0F, 4, 11, 1, 0.0F);
        
        this.CloakRightArmFront = new ModelRenderer(this, 10, 100);
        this.CloakRightArmFront.setRotationPoint(-8.0F, 0.0F, -3.0F);
        this.CloakRightArmFront.addBox(0.0F, 0.0F, 0.0F, 4, 11, 1, 0.0F);
        
        this.CloakRightArmLeft = new ModelRenderer(this, 10, 100);
        this.CloakRightArmLeft.setRotationPoint(-4.2F, 0.0F, -2.0F);
        this.CloakRightArmLeft.addBox(0.0F, 0.0F, 0.0F, 1, 11, 4, 0.0F);
        
        this.CloakRightArmRight = new ModelRenderer(this, 10, 100);
        this.CloakRightArmRight.setRotationPoint(-9.0F, 0.0F, -2.0F);
        this.CloakRightArmRight.addBox(0.0F, 0.0F, 0.0F, 1, 11, 4, 0.0F);
        
        this.CloakFront = new ModelRenderer(this, 10, 100);
        this.CloakFront.setRotationPoint(-4.0F, 2.0F, -3.0F);
        this.CloakFront.addBox(0.0F, 0.0F, 0.0F, 8, 10, 1, 0.0F);
        
        this.CloakRight = new ModelRenderer(this, 10, 100);
        this.CloakRight.setRotationPoint(-4.2F, 0.0F, -2.0F);
        this.CloakRight.addBox(0.0F, 0.0F, 0.0F, 1, 13, 4, 0.0F);
        
        //Left Leg - Leggings
        this.LeftLegLeft = new ModelRenderer(this, 18, 100);
        this.LeftLegLeft.setRotationPoint(4.0F, 12.0F, -2.0F);
        this.LeftLegLeft.addBox(0.0F, 0.0F, 0.0F, 1, 9, 4, 0.0F);
        
        this.LeftLegRight = new ModelRenderer(this, 18, 100);
        this.LeftLegRight.setRotationPoint(-0.2F, 12.0F, -2.0F);
        this.LeftLegRight.addBox(0.0F, 0.0F, 0.0F, 1, 9, 4, 0.0F);
        
        this.LeftLegBack = new ModelRenderer(this, 18, 100);
        this.LeftLegBack.setRotationPoint(0.0F, 12.0F, 2.0F);
        this.LeftLegBack.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1, 0.0F);
        
        this.LeftLegFront = new ModelRenderer(this, 18, 100);
        this.LeftLegFront.setRotationPoint(0.0F, 12.0F, -3.0F);
        this.LeftLegFront.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1, 0.0F);
        
        //Left Leg - Boots
        this.LeftBootFront = new ModelRenderer(this, 18, 100);
        this.LeftBootFront.setRotationPoint(0.0F, 21.0F, -3.0F);
        this.LeftBootFront.addBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F);
        
        this.LeftBootBottom = new ModelRenderer(this, 18, 100);
        this.LeftBootBottom.setRotationPoint(0.0F, 24.0F, -2.0F);
        this.LeftBootBottom.addBox(0.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F);
        
        this.LeftBootBack = new ModelRenderer(this, 18, 100);
        this.LeftBootBack.setRotationPoint(0.0F, 21.0F, 2.0F);
        this.LeftBootBack.addBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F);
        
        this.LeftBootLeft = new ModelRenderer(this, 18, 100);
        this.LeftBootLeft.setRotationPoint(4.0F, 21.0F, -2.0F);
        this.LeftBootLeft.addBox(0.0F, 0.0F, 0.0F, 1, 3, 4, 0.0F);
        
        this.LeftBootRight = new ModelRenderer(this, 18, 100);
        this.LeftBootRight.setRotationPoint(-0.2F, 21.0F, -2.0F);
        this.LeftBootRight.addBox(0.0F, 0.0F, 0.0F, 1, 3, 4, 0.0F);
        
        //Right Leg - Leggings
        this.RightLegFront = new ModelRenderer(this, 18, 100);
        this.RightLegFront.setRotationPoint(-4.0F, 12.0F, -3.0F);
        this.RightLegFront.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1, 0.0F);
        
        this.RightLegLeft = new ModelRenderer(this, 18, 100);
        this.RightLegLeft.setRotationPoint(-0.8F, 12.0F, -2.0F);
        this.RightLegLeft.addBox(0.0F, 0.0F, 0.0F, 1, 9, 4, 0.0F);
        
        this.RightLegRight = new ModelRenderer(this, 18, 100);
        this.RightLegRight.setRotationPoint(-5.0F, 12.0F, -2.0F);
        this.RightLegRight.addBox(0.0F, 0.0F, 0.0F, 1, 9, 4, 0.0F);
        
        this.RightBootBottom = new ModelRenderer(this, 18, 100);
        this.RightBootBottom.setRotationPoint(-4.0F, 24.0F, -2.0F);
        this.RightBootBottom.addBox(0.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F);
        
        this.RightLegBack = new ModelRenderer(this, 18, 100);
        this.RightLegBack.setRotationPoint(-4.0F, 12.0F, 2.0F);
        this.RightLegBack.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1, 0.0F);
        
       //Right Leg - Boots 
        this.RightBootLeft = new ModelRenderer(this, 18, 100);
        this.RightBootLeft.setRotationPoint(-0.8F, 21.0F, -2.0F);
        this.RightBootLeft.addBox(0.0F, 0.0F, 0.0F, 1, 3, 4, 0.0F);
        
        this.RightBootFront = new ModelRenderer(this, 18, 100);
        this.RightBootFront.setRotationPoint(-4.0F, 21.0F, -3.0F);
        this.RightBootFront.addBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F);
        
        this.RightBootBack = new ModelRenderer(this, 18, 100);
        this.RightBootBack.setRotationPoint(-4.0F, 21.0F, 2.0F);
        this.RightBootBack.addBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F);
        
        this.RightBootRight = new ModelRenderer(this, 18, 100);
        this.RightBootRight.setRotationPoint(-5.0F, 21.0F, -2.0F);
        this.RightBootRight.addBox(0.0F, 0.0F, 0.0F, 1, 3, 4, 0.0F);
        
        
        this.bipedHead.addChild(HoodBack);
        this.bipedHead.addChild(HoodFront);
        this.bipedHead.addChild(HoodTop);
        this.bipedHead.addChild(HoodLeft);
        this.bipedHead.addChild(HoodRight);
        this.bipedHead.addChild(HoodBottom);
        
        this.bipedBody.addChild(CloakBack);
        this.bipedBody.addChild(CloakLeftFlap);
        this.bipedBody.addChild(CloakLeftFlapSmall);
        this.bipedBody.addChild(CloakRightFlapSmall);
        this.bipedBody.addChild(CloakFront);
        this.bipedBody.addChild(CloakLeft);
        this.bipedBody.addChild(CloakRight);
        this.bipedBody.addChild(CloakRightFlap);
        
        this.bipedLeftArm.addChild(CloakLeftArmTop);
        this.bipedLeftArm.addChild(CloakLeftArmFront);
        this.bipedLeftArm.addChild(CloakLeftArmBack);
        this.bipedLeftArm.addChild(CloakLeftArmLeft);
        this.bipedLeftArm.addChild(CloakLeftArmRight);

        this.bipedRightArm.addChild(CloakRightArmTop);
        this.bipedRightArm.addChild(CloakRightArmFront);
        this.bipedRightArm.addChild(CloakRightArmBack);
        this.bipedRightArm.addChild(CloakRightArmLeft);
        this.bipedRightArm.addChild(CloakRightArmRight);
        
        this.bipedLeftLeg.addChild(LeftLegFront);
        this.bipedLeftLeg.addChild(LeftLegBack);
        this.bipedLeftLeg.addChild(LeftLegLeft);
        this.bipedLeftLeg.addChild(LeftLegRight);
        this.bipedLeftLeg.addChild(LeftBootFront);
        this.bipedLeftLeg.addChild(LeftBootBack);
        this.bipedLeftLeg.addChild(LeftBootLeft);
        this.bipedLeftLeg.addChild(LeftBootRight);
        this.bipedLeftLeg.addChild(LeftBootBottom);
        
        this.bipedRightLeg.addChild(RightLegFront);
        this.bipedRightLeg.addChild(RightLegBack);
        this.bipedRightLeg.addChild(RightLegLeft);
        this.bipedRightLeg.addChild(RightLegRight);
        this.bipedRightLeg.addChild(RightBootFront);
        this.bipedRightLeg.addChild(RightBootBack);
        this.bipedRightLeg.addChild(RightBootLeft);
        this.bipedRightLeg.addChild(RightBootRight);
        this.bipedRightLeg.addChild(RightBootBottom);
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

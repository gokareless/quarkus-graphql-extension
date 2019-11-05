package org.gokareless;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.undertow.deployment.ServletBuildItem;

class GraphQLProcessor {

    static final String FEATURE_NAME = "graphql";

    @BuildStep
    ServletBuildItem createGraphqlServlet() {
        System.out.println("GraphQLProcessor.createGraphqlServlet");
        ServletBuildItem servletBuildItem = ServletBuildItem.builder(FEATURE_NAME, GraphQLServlet.class.getName())
                .addMapping(FEATURE_NAME)
                .build();
        return servletBuildItem;
    }

    @BuildStep
    FeatureBuildItem createFeatureItem() {
        System.out.println("GraphQLProcessor.createGraphqlServlet");
        return new FeatureBuildItem(FEATURE_NAME);
    }

}

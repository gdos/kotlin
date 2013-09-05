/*
 * Copyright 2010-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.di;

import com.intellij.openapi.project.Project;
import org.jetbrains.jet.lang.resolve.BindingTrace;
import org.jetbrains.jet.lang.resolve.java.JavaClassFinderImpl;
import org.jetbrains.jet.lang.resolve.java.resolver.TraceBasedExternalSignatureResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.TraceBasedJavaResolverCache;
import org.jetbrains.jet.lang.resolve.java.resolver.FakeOverrideVisibilityResolverImpl;
import org.jetbrains.jet.lang.resolve.java.resolver.TraceBasedErrorReporter;
import org.jetbrains.jet.lang.resolve.java.resolver.PsiBasedMethodSignatureChecker;
import org.jetbrains.jet.lang.resolve.java.resolver.PsiBasedExternalAnnotationResolver;
import org.jetbrains.jet.lang.resolve.java.JavaDescriptorResolver;
import org.jetbrains.jet.lang.resolve.java.vfilefinder.VirtualFileFinder;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaAnnotationResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaAnnotationArgumentResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaClassResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.DeserializedDescriptorResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.AnnotationDescriptorDeserializer;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaNamespaceResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaMemberResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaConstructorResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaTypeTransformer;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaValueParameterResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaFunctionResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaTypeParameterResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaPropertyResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaSupertypeResolver;
import org.jetbrains.annotations.NotNull;
import javax.annotation.PreDestroy;

/* This file is generated by org.jetbrains.jet.generators.injectors.GenerateInjectors. DO NOT EDIT! */
public class InjectorForJavaDescriptorResolver {
    
    private final Project project;
    private final BindingTrace bindingTrace;
    private final JavaClassFinderImpl javaClassFinder;
    private final TraceBasedExternalSignatureResolver traceBasedExternalSignatureResolver;
    private final TraceBasedJavaResolverCache traceBasedJavaResolverCache;
    private final FakeOverrideVisibilityResolverImpl fakeOverrideVisibilityResolver;
    private final TraceBasedErrorReporter traceBasedErrorReporter;
    private final PsiBasedMethodSignatureChecker psiBasedMethodSignatureChecker;
    private final PsiBasedExternalAnnotationResolver psiBasedExternalAnnotationResolver;
    private final JavaDescriptorResolver javaDescriptorResolver;
    private final VirtualFileFinder virtualFileFinder;
    private final JavaAnnotationResolver javaAnnotationResolver;
    private final JavaAnnotationArgumentResolver javaAnnotationArgumentResolver;
    private final JavaClassResolver javaClassResolver;
    private final DeserializedDescriptorResolver deserializedDescriptorResolver;
    private final AnnotationDescriptorDeserializer annotationDescriptorDeserializer;
    private final JavaNamespaceResolver javaNamespaceResolver;
    private final JavaMemberResolver javaMemberResolver;
    private final JavaConstructorResolver javaConstructorResolver;
    private final JavaTypeTransformer javaTypeTransformer;
    private final JavaValueParameterResolver javaValueParameterResolver;
    private final JavaFunctionResolver javaFunctionResolver;
    private final JavaTypeParameterResolver javaTypeParameterResolver;
    private final JavaPropertyResolver javaPropertyResolver;
    private final JavaSupertypeResolver javaSupertypeResolver;
    
    public InjectorForJavaDescriptorResolver(
        @NotNull Project project,
        @NotNull BindingTrace bindingTrace
    ) {
        this.project = project;
        this.bindingTrace = bindingTrace;
        this.javaClassFinder = new JavaClassFinderImpl();
        this.traceBasedExternalSignatureResolver = new TraceBasedExternalSignatureResolver();
        this.traceBasedJavaResolverCache = new TraceBasedJavaResolverCache();
        this.fakeOverrideVisibilityResolver = new FakeOverrideVisibilityResolverImpl();
        this.traceBasedErrorReporter = new TraceBasedErrorReporter();
        this.psiBasedMethodSignatureChecker = new PsiBasedMethodSignatureChecker();
        this.psiBasedExternalAnnotationResolver = new PsiBasedExternalAnnotationResolver();
        this.javaDescriptorResolver = new JavaDescriptorResolver();
        this.virtualFileFinder = com.intellij.openapi.components.ServiceManager.getService(project, VirtualFileFinder.class);
        this.javaAnnotationResolver = new JavaAnnotationResolver();
        this.javaAnnotationArgumentResolver = new JavaAnnotationArgumentResolver();
        this.javaClassResolver = new JavaClassResolver();
        this.deserializedDescriptorResolver = new DeserializedDescriptorResolver();
        this.annotationDescriptorDeserializer = new AnnotationDescriptorDeserializer();
        this.javaNamespaceResolver = new JavaNamespaceResolver();
        this.javaMemberResolver = new JavaMemberResolver();
        this.javaConstructorResolver = new JavaConstructorResolver();
        this.javaTypeTransformer = new JavaTypeTransformer();
        this.javaValueParameterResolver = new JavaValueParameterResolver();
        this.javaFunctionResolver = new JavaFunctionResolver();
        this.javaTypeParameterResolver = new JavaTypeParameterResolver();
        this.javaPropertyResolver = new JavaPropertyResolver();
        this.javaSupertypeResolver = new JavaSupertypeResolver();

        this.javaClassFinder.setProject(project);

        traceBasedExternalSignatureResolver.setAnnotationResolver(javaAnnotationResolver);
        traceBasedExternalSignatureResolver.setTrace(bindingTrace);

        traceBasedJavaResolverCache.setTrace(bindingTrace);

        fakeOverrideVisibilityResolver.setTrace(bindingTrace);

        traceBasedErrorReporter.setTrace(bindingTrace);

        psiBasedMethodSignatureChecker.setAnnotationResolver(javaAnnotationResolver);
        psiBasedMethodSignatureChecker.setExternalSignatureResolver(traceBasedExternalSignatureResolver);

        this.javaDescriptorResolver.setClassResolver(javaClassResolver);
        this.javaDescriptorResolver.setNamespaceResolver(javaNamespaceResolver);

        javaAnnotationResolver.setArgumentResolver(javaAnnotationArgumentResolver);
        javaAnnotationResolver.setClassResolver(javaClassResolver);
        javaAnnotationResolver.setExternalAnnotationResolver(psiBasedExternalAnnotationResolver);

        javaAnnotationArgumentResolver.setAnnotationResolver(javaAnnotationResolver);
        javaAnnotationArgumentResolver.setClassResolver(javaClassResolver);
        javaAnnotationArgumentResolver.setTypeTransformer(javaTypeTransformer);

        javaClassResolver.setAnnotationResolver(javaAnnotationResolver);
        javaClassResolver.setCache(traceBasedJavaResolverCache);
        javaClassResolver.setDeserializedDescriptorResolver(deserializedDescriptorResolver);
        javaClassResolver.setFunctionResolver(javaFunctionResolver);
        javaClassResolver.setJavaClassFinder(javaClassFinder);
        javaClassResolver.setMemberResolver(javaMemberResolver);
        javaClassResolver.setNamespaceResolver(javaNamespaceResolver);
        javaClassResolver.setSupertypesResolver(javaSupertypeResolver);
        javaClassResolver.setTypeParameterResolver(javaTypeParameterResolver);
        javaClassResolver.setVirtualFileFinder(virtualFileFinder);

        deserializedDescriptorResolver.setAnnotationDeserializer(annotationDescriptorDeserializer);
        deserializedDescriptorResolver.setErrorReporter(traceBasedErrorReporter);
        deserializedDescriptorResolver.setJavaClassResolver(javaClassResolver);
        deserializedDescriptorResolver.setJavaNamespaceResolver(javaNamespaceResolver);

        annotationDescriptorDeserializer.setJavaClassResolver(javaClassResolver);
        annotationDescriptorDeserializer.setVirtualFileFinder(virtualFileFinder);

        javaNamespaceResolver.setCache(traceBasedJavaResolverCache);
        javaNamespaceResolver.setDeserializedDescriptorResolver(deserializedDescriptorResolver);
        javaNamespaceResolver.setJavaClassFinder(javaClassFinder);
        javaNamespaceResolver.setMemberResolver(javaMemberResolver);
        javaNamespaceResolver.setVirtualFileFinder(virtualFileFinder);

        javaMemberResolver.setClassResolver(javaClassResolver);
        javaMemberResolver.setConstructorResolver(javaConstructorResolver);
        javaMemberResolver.setFunctionResolver(javaFunctionResolver);
        javaMemberResolver.setNamespaceResolver(javaNamespaceResolver);
        javaMemberResolver.setPropertyResolver(javaPropertyResolver);

        javaConstructorResolver.setCache(traceBasedJavaResolverCache);
        javaConstructorResolver.setExternalSignatureResolver(traceBasedExternalSignatureResolver);
        javaConstructorResolver.setTypeTransformer(javaTypeTransformer);
        javaConstructorResolver.setValueParameterResolver(javaValueParameterResolver);

        javaTypeTransformer.setClassResolver(javaClassResolver);

        javaValueParameterResolver.setAnnotationResolver(javaAnnotationResolver);
        javaValueParameterResolver.setTypeTransformer(javaTypeTransformer);

        javaFunctionResolver.setAnnotationResolver(javaAnnotationResolver);
        javaFunctionResolver.setCache(traceBasedJavaResolverCache);
        javaFunctionResolver.setExternalSignatureResolver(traceBasedExternalSignatureResolver);
        javaFunctionResolver.setFakeOverrideVisibilityResolver(fakeOverrideVisibilityResolver);
        javaFunctionResolver.setSignatureChecker(psiBasedMethodSignatureChecker);
        javaFunctionResolver.setTypeParameterResolver(javaTypeParameterResolver);
        javaFunctionResolver.setTypeTransformer(javaTypeTransformer);
        javaFunctionResolver.setValueParameterResolver(javaValueParameterResolver);

        javaTypeParameterResolver.setTypeTransformer(javaTypeTransformer);

        javaPropertyResolver.setAnnotationResolver(javaAnnotationResolver);
        javaPropertyResolver.setCache(traceBasedJavaResolverCache);
        javaPropertyResolver.setExternalSignatureResolver(traceBasedExternalSignatureResolver);
        javaPropertyResolver.setFakeOverrideVisibilityResolver(fakeOverrideVisibilityResolver);
        javaPropertyResolver.setTypeTransformer(javaTypeTransformer);

        javaSupertypeResolver.setClassResolver(javaClassResolver);
        javaSupertypeResolver.setTypeTransformer(javaTypeTransformer);

        javaClassFinder.initialize();

    }
    
    @PreDestroy
    public void destroy() {
    }
    
    public JavaClassFinderImpl getJavaClassFinder() {
        return this.javaClassFinder;
    }
    
    public JavaDescriptorResolver getJavaDescriptorResolver() {
        return this.javaDescriptorResolver;
    }
    
}

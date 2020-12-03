package com.projetbiblio.halg.com;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {

        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("com.projetbiblio.halg.com");

        noClasses()
            .that()
                .resideInAnyPackage("com.projetbiblio.halg.com.service..")
            .or()
                .resideInAnyPackage("com.projetbiblio.halg.com.repository..")
            .should().dependOnClassesThat()
                .resideInAnyPackage("..com.projetbiblio.halg.com.web..")
        .because("Services and repositories should not depend on web layer")
        .check(importedClasses);
    }
}

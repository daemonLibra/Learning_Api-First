# Learning_Api-First
Learning Api-First with Swagger, OpenApi and SpringBoot

## Materials
 - https://www.youtube.com/watch?v=YmQyzNF5iKg <- video I used to make the project, good video about 17 min
 
´´´
            <plugin>
                <groupId>io.swagger.codegen.v3</groupId>
                <artifactId>swagger-codegen-maven-plugin</artifactId>
                <version>3.0.18</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>generate</goal>
                        </goals>
                        <configuration>
                            <inputSpec>${project.basedir}/src/main/resources/library-api.yaml</inputSpec>
                            <language>spring</language>
                            <output>${project.build.directory}/generated-sources/</output>
                            <generateSupportingFiles>false</generateSupportingFiles>
                            <apiPackage>com.michael.libraryservice.api</apiPackage>
                            <modelPackage>com.michael.libraryservice.models</modelPackage>
                            <configOptions>
                                <interfaceOnly>true</interfaceOnly>
                            </configOptions>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
´´´

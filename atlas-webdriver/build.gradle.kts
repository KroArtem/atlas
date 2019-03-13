description = "Atlas Webdriver"

dependencies {
    api(project(":atlas-core"))

    implementation("org.seleniumhq.selenium:selenium-java")
    implementation("org.hamcrest:hamcrest:2.1")
    implementation("org.hamcrest:hamcrest-library:2.1")
    implementation("org.apache.httpcomponents:httpclient:4.5.7")

    testImplementation("ru.yandex.qatools.matchers:webdriver-matchers")
    testImplementation("org.apache.commons:commons-lang3")
    testImplementation("org.mockito:mockito-all")
    testImplementation("org.assertj:assertj-core")
    testImplementation("junit:junit")
}

# Kotlin interop with Java

This repo shows an example on how to manage interop between Kotlin and Java, in the particular case of a partial conversion of a project that uses ButterKnife from Java to Kotlin.

For more information see [this blog post](https://xrubio.com/2017/07/kotlin-interop-mixing-kotlin-and-java-butterknife-annotated-activities/).

This repo has for branches:

- **master**: original code, only Java
- **kotlin-annotationprocessor**: second activity converted to Kotlin, still using `annotationProcessor`. Compiles, but injection fails.
- **kotlin-annotationprocessor-kapt**: second activity converted to Kotlin, using both `annotationProcessor` and `kapt`. Compilation fails with "Error:@BindView fields must not be private or static." I've also seen a "Error:Execution failed for task ':app:compileDebugJavaWithJavac'.
> kotlin.jvm.internal.FunctionReference.<init>(ILjava/lang/Object;)V" in some cases. See the following Stack Overflow question: [Project won't build with Kotlin 1.1.3](https://stackoverflow.com/questions/44769417/project-wont-build-with-kotlin-1-1-3).
- **kotlin-kapt**: second activity converted to Kotlin, using only `kapt`. Same issue.
- **kotlin-workaround**: second activity converted to Kotlin, using `annotationProcessor`. Uses a `@JvmField()` to workaround the problem of ButterKnife not injecting the Kotlin activity.

Notice that there are two small, Espresso tests that check if injection has been successful in each activity. Also, the message at the bottom of each activity shows you whether the injection succeeded or not.

## License

> MIT License
>
> Copyright (c) 2017 Xavier Rubio Jansana
>
> Permission is hereby granted, free of charge, to any person obtaining a copy
> of this software and associated documentation files (the "Software"), to deal
> in the Software without restriction, including without limitation the rights
> to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
> copies of the Software, and to permit persons to whom the Software is
> furnished to do so, subject to the following conditions:
>
> The above copyright notice and this permission notice shall be included in all
> copies or substantial portions of the Software.
>
> THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
> IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
> FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
> AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
> LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
> OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
> SOFTWARE.

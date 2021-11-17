# SdkApplication
> Step 1. Add the JitPack repository to your build file

''' glidle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  '''
  >Step 2. Add the dependency
  ''' gridle
  dependencies {
	        implementation 'com.github.madanImg:SdkApplication:Tag'
	}
  '''

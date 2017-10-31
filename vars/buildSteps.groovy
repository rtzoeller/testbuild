// Required constants
BUILT_DIR = 'Built'
ARCHIVE_DIR = '\\\\nirvana\\temp\\dbuck\\testbuild'

PROJECT_PATH = 'src\\lvBuildSpec.lvproj'
MY_COMPUTER_TARGET = 'My Computer'
BUILD_SPEC = 'SourceDist'

def build(lvVersion){
  echo 'Building the test library...'
  lvBuildSpec(PROJECT_PATH, MY_COMPUTER_TARGET, BUILD_SPEC, lvVersion)
}

//This function should be a no-op until we can use a toolchain version of LV
//This is intended to be used to copy files into LV in an arbitrary location (i.e. not through an installer)
//on the build machine. We can't do that now, but don't want to have to update the pipeline
//and every single add-on to have this function once we have that capability
def setupLv(lvVersion){
  noop()
}

def prepareSource(lvVersion){
  copyProjectConfig(PROJECT_PATH, lvVersion)
}

def syncDependencies(){
  noop()
}

def codegen(lvVersion){
  noop()
}

//this is required for dynamic loading of this file
return this;

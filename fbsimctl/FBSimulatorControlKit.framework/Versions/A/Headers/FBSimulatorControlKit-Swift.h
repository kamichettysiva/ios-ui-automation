// Generated by Apple Swift version 3.1 (swiftlang-802.0.48 clang-802.0.38)
#pragma clang diagnostic push

#if defined(__has_include) && __has_include(<swift/objc-prologue.h>)
# include <swift/objc-prologue.h>
#endif

#pragma clang diagnostic ignored "-Wauto-import"
#include <objc/NSObject.h>
#include <stdint.h>
#include <stddef.h>
#include <stdbool.h>

#if !defined(SWIFT_TYPEDEFS)
# define SWIFT_TYPEDEFS 1
# if defined(__has_include) && __has_include(<uchar.h>)
#  include <uchar.h>
# elif !defined(__cplusplus) || __cplusplus < 201103L
typedef uint_least16_t char16_t;
typedef uint_least32_t char32_t;
# endif
typedef float swift_float2  __attribute__((__ext_vector_type__(2)));
typedef float swift_float3  __attribute__((__ext_vector_type__(3)));
typedef float swift_float4  __attribute__((__ext_vector_type__(4)));
typedef double swift_double2  __attribute__((__ext_vector_type__(2)));
typedef double swift_double3  __attribute__((__ext_vector_type__(3)));
typedef double swift_double4  __attribute__((__ext_vector_type__(4)));
typedef int swift_int2  __attribute__((__ext_vector_type__(2)));
typedef int swift_int3  __attribute__((__ext_vector_type__(3)));
typedef int swift_int4  __attribute__((__ext_vector_type__(4)));
typedef unsigned int swift_uint2  __attribute__((__ext_vector_type__(2)));
typedef unsigned int swift_uint3  __attribute__((__ext_vector_type__(3)));
typedef unsigned int swift_uint4  __attribute__((__ext_vector_type__(4)));
#endif

#if !defined(SWIFT_PASTE)
# define SWIFT_PASTE_HELPER(x, y) x##y
# define SWIFT_PASTE(x, y) SWIFT_PASTE_HELPER(x, y)
#endif
#if !defined(SWIFT_METATYPE)
# define SWIFT_METATYPE(X) Class
#endif
#if !defined(SWIFT_CLASS_PROPERTY)
# if __has_feature(objc_class_property)
#  define SWIFT_CLASS_PROPERTY(...) __VA_ARGS__
# else
#  define SWIFT_CLASS_PROPERTY(...)
# endif
#endif

#if defined(__has_attribute) && __has_attribute(objc_runtime_name)
# define SWIFT_RUNTIME_NAME(X) __attribute__((objc_runtime_name(X)))
#else
# define SWIFT_RUNTIME_NAME(X)
#endif
#if defined(__has_attribute) && __has_attribute(swift_name)
# define SWIFT_COMPILE_NAME(X) __attribute__((swift_name(X)))
#else
# define SWIFT_COMPILE_NAME(X)
#endif
#if defined(__has_attribute) && __has_attribute(objc_method_family)
# define SWIFT_METHOD_FAMILY(X) __attribute__((objc_method_family(X)))
#else
# define SWIFT_METHOD_FAMILY(X)
#endif
#if defined(__has_attribute) && __has_attribute(noescape)
# define SWIFT_NOESCAPE __attribute__((noescape))
#else
# define SWIFT_NOESCAPE
#endif
#if defined(__has_attribute) && __has_attribute(warn_unused_result)
# define SWIFT_WARN_UNUSED_RESULT __attribute__((warn_unused_result))
#else
# define SWIFT_WARN_UNUSED_RESULT
#endif
#if !defined(SWIFT_CLASS_EXTRA)
# define SWIFT_CLASS_EXTRA
#endif
#if !defined(SWIFT_PROTOCOL_EXTRA)
# define SWIFT_PROTOCOL_EXTRA
#endif
#if !defined(SWIFT_ENUM_EXTRA)
# define SWIFT_ENUM_EXTRA
#endif
#if !defined(SWIFT_CLASS)
# if defined(__has_attribute) && __has_attribute(objc_subclassing_restricted)
#  define SWIFT_CLASS(SWIFT_NAME) SWIFT_RUNTIME_NAME(SWIFT_NAME) __attribute__((objc_subclassing_restricted)) SWIFT_CLASS_EXTRA
#  define SWIFT_CLASS_NAMED(SWIFT_NAME) __attribute__((objc_subclassing_restricted)) SWIFT_COMPILE_NAME(SWIFT_NAME) SWIFT_CLASS_EXTRA
# else
#  define SWIFT_CLASS(SWIFT_NAME) SWIFT_RUNTIME_NAME(SWIFT_NAME) SWIFT_CLASS_EXTRA
#  define SWIFT_CLASS_NAMED(SWIFT_NAME) SWIFT_COMPILE_NAME(SWIFT_NAME) SWIFT_CLASS_EXTRA
# endif
#endif

#if !defined(SWIFT_PROTOCOL)
# define SWIFT_PROTOCOL(SWIFT_NAME) SWIFT_RUNTIME_NAME(SWIFT_NAME) SWIFT_PROTOCOL_EXTRA
# define SWIFT_PROTOCOL_NAMED(SWIFT_NAME) SWIFT_COMPILE_NAME(SWIFT_NAME) SWIFT_PROTOCOL_EXTRA
#endif

#if !defined(SWIFT_EXTENSION)
# define SWIFT_EXTENSION(M) SWIFT_PASTE(M##_Swift_, __LINE__)
#endif

#if !defined(OBJC_DESIGNATED_INITIALIZER)
# if defined(__has_attribute) && __has_attribute(objc_designated_initializer)
#  define OBJC_DESIGNATED_INITIALIZER __attribute__((objc_designated_initializer))
# else
#  define OBJC_DESIGNATED_INITIALIZER
# endif
#endif
#if !defined(SWIFT_ENUM)
# define SWIFT_ENUM(_type, _name) enum _name : _type _name; enum SWIFT_ENUM_EXTRA _name : _type
# if defined(__has_feature) && __has_feature(generalized_swift_name)
#  define SWIFT_ENUM_NAMED(_type, _name, SWIFT_NAME) enum _name : _type _name SWIFT_COMPILE_NAME(SWIFT_NAME); enum SWIFT_COMPILE_NAME(SWIFT_NAME) SWIFT_ENUM_EXTRA _name : _type
# else
#  define SWIFT_ENUM_NAMED(_type, _name, SWIFT_NAME) SWIFT_ENUM(_type, _name)
# endif
#endif
#if !defined(SWIFT_UNAVAILABLE)
# define SWIFT_UNAVAILABLE __attribute__((unavailable))
#endif
#if !defined(SWIFT_UNAVAILABLE_MSG)
# define SWIFT_UNAVAILABLE_MSG(msg) __attribute__((unavailable(msg)))
#endif
#if !defined(SWIFT_AVAILABILITY)
# define SWIFT_AVAILABILITY(plat, ...) __attribute__((availability(plat, __VA_ARGS__)))
#endif
#if !defined(SWIFT_DEPRECATED)
# define SWIFT_DEPRECATED __attribute__((deprecated))
#endif
#if !defined(SWIFT_DEPRECATED_MSG)
# define SWIFT_DEPRECATED_MSG(...) __attribute__((deprecated(__VA_ARGS__)))
#endif
#if defined(__has_feature) && __has_feature(modules)
@import ObjectiveC;
@import FBControlCore;
@import FBSimulatorControl;
#endif

#import <FBSimulatorControlKit/FBSimulatorControlKit.h>

#pragma clang diagnostic ignored "-Wproperty-attribute-mismatch"
#pragma clang diagnostic ignored "-Wduplicate-method-arg"

SWIFT_CLASS("_TtC21FBSimulatorControlKit15CLIBootstrapper")
@interface CLIBootstrapper : NSObject
+ (int32_t)bootstrap SWIFT_WARN_UNUSED_RESULT;
- (nonnull instancetype)init OBJC_DESIGNATED_INITIALIZER;
@end


SWIFT_CLASS("_TtC21FBSimulatorControlKit23ControlCoreLoggerBridge")
@interface ControlCoreLoggerBridge : NSObject
- (void)log:(int32_t)level string:(NSString * _Nonnull)string;
- (nonnull instancetype)init SWIFT_UNAVAILABLE;
@end


@interface FBApplicationDescriptor (SWIFT_EXTENSION(FBSimulatorControlKit))
@end


@interface FBLineBuffer (SWIFT_EXTENSION(FBSimulatorControlKit))
@end


@interface FBProcessOutputConfiguration (SWIFT_EXTENSION(FBSimulatorControlKit))
- (nonnull instancetype)append:(FBProcessOutputConfiguration * _Nonnull)other SWIFT_WARN_UNUSED_RESULT;
@end


@interface FBSimulatorBootConfiguration (SWIFT_EXTENSION(FBSimulatorControlKit))
- (nonnull instancetype)append:(FBSimulatorBootConfiguration * _Nonnull)other SWIFT_WARN_UNUSED_RESULT;
@end


@interface FBiOSTargetFormat (SWIFT_EXTENSION(FBSimulatorControlKit))
- (nonnull instancetype)append:(FBiOSTargetFormat * _Nonnull)other SWIFT_WARN_UNUSED_RESULT;
@end


@interface FBiOSTargetQuery (SWIFT_EXTENSION(FBSimulatorControlKit))
@end


@interface FBiOSTargetQuery (SWIFT_EXTENSION(FBSimulatorControlKit))
- (nonnull instancetype)append:(FBiOSTargetQuery * _Nonnull)other SWIFT_WARN_UNUSED_RESULT;
@end


@interface FBiOSTargetQuery (SWIFT_EXTENSION(FBSimulatorControlKit))
+ (FBiOSTargetQuery * _Nonnull)ofCount:(NSInteger)count SWIFT_WARN_UNUSED_RESULT;
- (FBiOSTargetQuery * _Nonnull)ofCount:(NSInteger)count SWIFT_WARN_UNUSED_RESULT;
@end


@interface HttpRequest (SWIFT_EXTENSION(FBSimulatorControlKit))
@end


@interface HttpRequest (SWIFT_EXTENSION(FBSimulatorControlKit))
@end


SWIFT_CLASS("_TtC21FBSimulatorControlKit17JSONEventReporter")
@interface JSONEventReporter : NSObject
- (nonnull instancetype)init SWIFT_UNAVAILABLE;
@end

@class FBSimulator;
@protocol FBiOSTarget;
@class FBProcessInfo;
@class FBSimulatorConnection;
@class FBTestManager;
@class FBAgentLaunchConfiguration;
@class NSFileHandle;
@class FBApplicationLaunchConfiguration;
@class FBDiagnostic;
@protocol FBTerminationHandle;

SWIFT_CLASS("_TtC21FBSimulatorControlKit17SimulatorReporter")
@interface SimulatorReporter : NSObject <FBSimulatorEventSink>
@property (nonatomic, readonly, assign) FBSimulator * _Nonnull simulator;
@property (nonatomic, readonly, strong) FBiOSTargetFormat * _Nonnull format;
@property (nonatomic, readonly, strong) id <FBiOSTarget> _Nonnull target;
- (void)containerApplicationDidLaunch:(FBProcessInfo * _Nonnull)applicationProcess;
- (void)containerApplicationDidTerminate:(FBProcessInfo * _Nonnull)applicationProcess expected:(BOOL)expected;
- (void)connectionDidConnect:(FBSimulatorConnection * _Nonnull)connection;
- (void)connectionDidDisconnect:(FBSimulatorConnection * _Nonnull)connection expected:(BOOL)expected;
- (void)testmanagerDidConnect:(FBTestManager * _Nonnull)testManager;
- (void)testmanagerDidDisconnect:(FBTestManager * _Nonnull)testManager;
- (void)simulatorDidLaunch:(FBProcessInfo * _Nonnull)launchdProcess;
- (void)simulatorDidTerminate:(FBProcessInfo * _Nonnull)launchdProcess expected:(BOOL)expected;
- (void)agentDidLaunch:(FBAgentLaunchConfiguration * _Nonnull)launchConfig didStart:(FBProcessInfo * _Nonnull)agentProcess stdOut:(NSFileHandle * _Nonnull)stdOut stdErr:(NSFileHandle * _Nonnull)stdErr;
- (void)agentDidTerminate:(FBProcessInfo * _Nonnull)agentProcess expected:(BOOL)expected;
- (void)applicationDidLaunch:(FBApplicationLaunchConfiguration * _Nonnull)launchConfig didStart:(FBProcessInfo * _Nonnull)applicationProcess;
- (void)applicationDidTerminate:(FBProcessInfo * _Nonnull)applicationProcess expected:(BOOL)expected;
- (void)diagnosticAvailable:(FBDiagnostic * _Nonnull)log;
- (void)didChangeState:(FBSimulatorState)state;
- (void)terminationHandleAvailable:(id <FBTerminationHandle> _Nonnull)terminationHandle;
- (nonnull instancetype)init SWIFT_UNAVAILABLE;
@end

#pragma clang diagnostic pop

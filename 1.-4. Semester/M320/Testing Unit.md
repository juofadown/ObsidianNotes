
```C#
[TestClass]
```

```C#
namespace TestingUnit.Test
{
    [TestClass] // tells VS that this class is gonna be a bunch of UnitTests.
    public sealed class CalculatorTests
    {
        [TestMethod] // tells VS that this is a unit test, so the framework treats it as a unit test
        // naming MethodName_Scenario_ExpxtedOutcome
        public void Add_AddsTwoNumbers_SumOfThoseNumbers()
        {

        }
    }
}

```

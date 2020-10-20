package dunkmania101.spatialharvesters.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.VoxelShapes;

import java.util.stream.Stream;

public class ActivatorBlock extends CustomShapedBlock {
    public ActivatorBlock(Properties properties) {
        super(properties, Stream.of(
                Block.makeCuboidShape(5, 1, 5, 11, 2, 11),
                Block.makeCuboidShape(5, 15, 5, 11, 16, 11),
                Block.makeCuboidShape(7, 2, 7, 9, 15, 9),
                Block.makeCuboidShape(4, 1, 4, 5, 12, 6),
                Block.makeCuboidShape(5, 1, 4, 6, 12, 5),
                Block.makeCuboidShape(4, 1, 10, 5, 12, 12),
                Block.makeCuboidShape(10, 1, 11, 11, 12, 12),
                Block.makeCuboidShape(5, 1, 11, 6, 12, 12),
                Block.makeCuboidShape(5, 2, 10, 6, 15, 11),
                Block.makeCuboidShape(10, 2, 10, 11, 15, 11),
                Block.makeCuboidShape(10, 2, 5, 11, 15, 6),
                Block.makeCuboidShape(5, 2, 5, 6, 15, 6),
                Block.makeCuboidShape(11, 1, 10, 12, 12, 12),
                Block.makeCuboidShape(11, 1, 4, 12, 12, 6),
                Block.makeCuboidShape(10, 1, 4, 11, 12, 5),
                Block.makeCuboidShape(3, 0, 3, 13, 1, 13)
        ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get());
    }
}
